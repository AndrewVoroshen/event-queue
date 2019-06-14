package com.exadel.beanpractice.event.generator;

import com.exadel.beanpractice.event.model.EventType;

public class CustomEventGenerator extends EventGenerator {

	@Override
	protected String generateMessage() {
		return "custom";
	}

	@Override
	protected EventType generateEventType() {
		return EventType.CUSTOM;
	}
}
