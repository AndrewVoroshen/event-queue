package com.exadel.beanpractice.common.util;

import java.util.Random;

public final class Randomizer {

	public static Integer getRandomNumber(Integer upperBound) {
		return new Random()
				.nextInt(upperBound);
	}
}
