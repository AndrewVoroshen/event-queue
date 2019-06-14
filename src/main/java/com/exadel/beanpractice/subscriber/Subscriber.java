package com.exadel.beanpractice.subscriber;

import com.exadel.beanpractice.event.model.Event;
import com.exadel.beanpractice.event.model.EventType;

import static com.exadel.beanpractice.common.util.Formatter.formatLocalDateTime;
import static com.exadel.beanpractice.common.util.TimeConverter.millisToLocalDateTime;

public interface Subscriber {

	default void consume(Event event) {
		System.out.println(
				String.format("%s successfully received event of type: %s send on: %s with message: %s ",
						getClass().getSimpleName(),
						event.getEventType(),
						formatLocalDateTime("yyyy/MM/dd hh:mm:ss", millisToLocalDateTime(event.getMillis())),
						event.getMessage()
				)
		);
	}

	boolean supports(EventType eventType);
}
