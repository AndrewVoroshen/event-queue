package com.exadel.beanpractice.generator;

import com.exadel.beanpractice.event.EventType;

public class SystemEventGenerator extends EventGenerator {

	@Override
	protected String getMessage() {
		return "system"; // TODO: make it randomly generated
	}

	@Override
	protected EventType getEventType() {
		return EventType.SYSTEM;
	}
}
