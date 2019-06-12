package com.exadel.beanpractice.generator;

import com.exadel.beanpractice.event.Event;
import com.exadel.beanpractice.event.EventType;

import java.time.Instant;

public abstract class EventGenerator {

	public Event generate() {
		return Event.builder()
				.eventType(getEventType())
				.message(getMessage())
				.millis(getMillis())
				.build();
	}

	protected abstract String getMessage();

	protected abstract EventType getEventType();

	protected Long getMillis() {
		return Instant.now().toEpochMilli();
	}
}
