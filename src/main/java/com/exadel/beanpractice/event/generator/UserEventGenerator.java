package com.exadel.beanpractice.event.generator;

import com.exadel.beanpractice.common.util.Randomizer;
import com.exadel.beanpractice.event.model.EventType;
import com.exadel.beanpractice.provider.impl.UserProvider;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserEventGenerator extends EventGenerator {

	private final UserProvider userProvider;

	@Override
	protected String generateMessage() {
		return Randomizer.getRandomNumber(userProvider.getMapSize())
				.toString();
	}

	@Override
	protected EventType generateEventType() {
		return EventType.USER;
	}
}
