package com.exadel.beanpractice.util;

import java.util.Random;

public final class Randomizer {

	public static int getRandomNumber(int upperBound) {
		return new Random()
				.nextInt(upperBound);
	}
}
