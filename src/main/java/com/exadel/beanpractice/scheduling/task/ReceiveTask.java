package com.exadel.beanpractice.scheduling.task;

import com.exadel.beanpractice.storage.EventStorage;
import lombok.RequiredArgsConstructor;

import java.util.TimerTask;

@RequiredArgsConstructor
public class ReceiveTask extends TimerTask {

	private final EventStorage eventStorage;

	@Override
	public void run() {
		eventStorage.receive();
	}
}
