package com.exadel.beanpractice.common.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public final class TimeConverter {

	public static LocalDateTime millisToLocalDateTime(Long millis) {
		return LocalDateTime.ofInstant(
				Instant.ofEpochMilli(millis),
				ZoneId.systemDefault()
		);
	}
}
