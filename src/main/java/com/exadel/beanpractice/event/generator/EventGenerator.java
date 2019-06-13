package com.exadel.beanpractice.event.generator;

import com.exadel.beanpractice.common.interfaces.Generator;
import com.exadel.beanpractice.event.model.Event;
import com.exadel.beanpractice.event.model.EventType;

import java.time.Instant;

public abstract class EventGenerator implements Generator<Event> {

	public Event generate() {
		return Event.builder()
				.eventType(generateEventType())
				.message(generateMessage())
				.millis(generateMillis())
				.build();
	}

	protected abstract String generateMessage();

	protected abstract EventType generateEventType();

	private Long generateMillis() {
		return Instant.now().toEpochMilli();
	}
}
