package com.exadel.beanpractice.event.generator;

import com.exadel.beanpractice.event.model.EventType;

public class SystemEventGenerator extends EventGenerator {

	@Override
	protected String generateMessage() {
		return "system"; // TODO: make it randomly generated
	}

	@Override
	protected EventType generateEventType() {
		return EventType.SYSTEM;
	}
}
