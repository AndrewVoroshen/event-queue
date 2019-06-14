package com.exadel.beanpractice.scheduling;

import com.exadel.beanpractice.scheduling.task.PublishTask;
import com.exadel.beanpractice.scheduling.task.ReceiveTask;
import lombok.RequiredArgsConstructor;

import java.util.Timer;

@RequiredArgsConstructor
public class CustomTimer extends Timer {

	private static final Long TIME_BASE = 1000L; // second in millis
	private static final Long DELAY = 0L;
	private static final Long PERIOD = 3 * TIME_BASE;

	private final PublishTask publishTask;

	private final ReceiveTask receiveTask;

	private void onInit()
	{
		this.schedule(publishTask, DELAY, PERIOD);
		this.schedule(receiveTask, DELAY, TIME_BASE);
	}
}
