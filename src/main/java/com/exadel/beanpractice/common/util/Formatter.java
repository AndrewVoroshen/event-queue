package com.exadel.beanpractice.common.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class Formatter {

	public static String formatLocalDateTime(String pattern, LocalDateTime localDateTime) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		return localDateTime.format(formatter);
	}
}
