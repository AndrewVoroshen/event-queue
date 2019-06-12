package com.exadel.beanpractice.publisher.impl;

import com.exadel.beanpractice.event.Event;
import com.exadel.beanpractice.generator.EventGenerator;
import com.exadel.beanpractice.publisher.Publisher;
import com.exadel.beanpractice.queue.EventQueue;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.exadel.beanpractice.util.Randomizer.getRandomNumber;

@RequiredArgsConstructor
public class DefaultPublisher implements Publisher {

	private final EventQueue eventQueue;

	private final List<EventGenerator> eventGenerators;

	public void publish() {

		EventGenerator eventGenerator = eventGenerators.get(
				getRandomNumber(eventGenerators.size())
		);

		Event generatedEvent = eventGenerator.generate();

		eventQueue.put(generatedEvent);
	}
}
