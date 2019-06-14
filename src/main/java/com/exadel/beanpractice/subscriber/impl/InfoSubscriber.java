package com.exadel.beanpractice.subscriber.impl;

import com.exadel.beanpractice.event.model.EventType;
import com.exadel.beanpractice.subscriber.Subscriber;

public class InfoSubscriber implements Subscriber {

	@Override
	public boolean supports(EventType eventType) {
		return eventType == EventType.INFO;
	}
}
