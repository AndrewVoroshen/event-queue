package com.exadel.beanpractice.subscriber;

import com.exadel.beanpractice.event.Event;
import com.exadel.beanpractice.event.EventType;

public interface Subscriber {

	void consume(Event event);

	boolean supports(EventType eventType);
}
