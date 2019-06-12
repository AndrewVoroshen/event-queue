package com.exadel.beanpractice.subscriber.impl;

import com.exadel.beanpractice.event.Event;
import com.exadel.beanpractice.event.EventType;
import com.exadel.beanpractice.subscriber.Subscriber;

public class SystemSubscriber implements Subscriber {

	@Override
	public void consume(Event event) {

	}

	@Override
	public boolean supports(EventType eventType) {
		return eventType == EventType.SYSTEM;
	}
}
