package com.exadel.beanpractice.subscriber;

import com.exadel.beanpractice.event.model.Event;
import com.exadel.beanpractice.event.model.EventType;

public interface Subscriber {

	void consume(Event event);

	boolean supports(EventType eventType);
}
