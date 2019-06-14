package com.exadel.beanpractice.subscriber.impl;

import com.exadel.beanpractice.event.model.Event;
import com.exadel.beanpractice.event.model.EventType;
import com.exadel.beanpractice.provider.impl.UserProvider;
import com.exadel.beanpractice.subscriber.Subscriber;
import lombok.RequiredArgsConstructor;

import static com.exadel.beanpractice.common.util.Formatter.formatLocalDateTime;
import static com.exadel.beanpractice.common.util.TimeConverter.millisToLocalDateTime;

@RequiredArgsConstructor
public class UserSubscriber implements Subscriber {

	private final UserProvider userProvider;

	@Override
	public void consume(Event event) {
		System.out.println(
				String.format("%s successfully received event of type: %s send on: %s with User: %s ",
						getClass().getSimpleName(),
						event.getEventType(),
						formatLocalDateTime("yyyy/mm/dd hh:mm:ss", millisToLocalDateTime(event.getMillis())),
						userProvider.getById(Integer.valueOf(event.getMessage()))
				)
		);
	}

	@Override
	public boolean supports(EventType eventType) {
		return eventType == EventType.USER;
	}
}
