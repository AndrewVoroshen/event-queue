package com.exadel.beanpractice.storage;

import com.exadel.beanpractice.event.model.Event;
import com.exadel.beanpractice.subscriber.Subscriber;
import lombok.RequiredArgsConstructor;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Queue;

@RequiredArgsConstructor
public class EventStorage {

	private final List<Subscriber> subscribers;

	private Queue<Event> eventQueue = new LinkedList<>();

	public void put(Event event) {
		eventQueue.add(event);
	}

	public void receive() {
		Event head = eventQueue.poll();
		if (head != null) {
			Optional<Subscriber> matchedSubscriber = subscribers.stream()
					.filter(
							subscriber -> head.getEventType() != null && subscriber.supports(head.getEventType())
					)
					.findFirst();
			matchedSubscriber.ifPresent(subscriber -> subscriber.consume(head));
		}
	}
}
