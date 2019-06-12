package com.exadel.beanpractice.event;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Event {

	private String message;

	private Long millis;

	private EventType eventType;
}
