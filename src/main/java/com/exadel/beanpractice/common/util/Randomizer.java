package com.exadel.beanpractice.common.util;

import java.util.Random;

public final class Randomizer {

	public static int getRandomNumber(int upperBound) {
		return new Random()
				.nextInt(upperBound);
	}
}
