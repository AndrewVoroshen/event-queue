package com.exadel.beanpractice.event.generator;

import com.exadel.beanpractice.event.model.EventType;

public class ErrorEventGenerator extends EventGenerator{

	@Override
	protected String generateMessage() {
		return "error";
	}

	@Override
	protected EventType generateEventType() {
		return EventType.ERROR;
	}
}
