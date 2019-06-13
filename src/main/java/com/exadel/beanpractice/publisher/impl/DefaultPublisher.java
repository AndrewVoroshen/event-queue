package com.exadel.beanpractice.publisher.impl;

import com.exadel.beanpractice.event.model.Event;
import com.exadel.beanpractice.event.generator.EventGenerator;
import com.exadel.beanpractice.publisher.Publisher;
import com.exadel.beanpractice.storage.EventStorage;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.exadel.beanpractice.common.util.Randomizer.getRandomNumber;

@RequiredArgsConstructor
public class DefaultPublisher implements Publisher {

	private final EventStorage eventStorage;

	private final List<EventGenerator> eventGenerators;

	public void publish() {
		EventGenerator eventGenerator = eventGenerators.get(
				getRandomNumber(eventGenerators.size())
		);
		Event generatedEvent = eventGenerator.generate();
		eventStorage.put(generatedEvent);
	}
}
