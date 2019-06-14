package com.exadel.beanpractice.event.generator;

import com.exadel.beanpractice.event.model.EventType;

public class InfoEventGenerator extends EventGenerator {

	@Override
	protected String generateMessage() {
		return "info";
	}

	@Override
	protected EventType generateEventType() {
		return EventType.INFO;
	}
}
