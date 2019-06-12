package com.exadel.beanpractice.scheduling;

import com.exadel.beanpractice.publisher.Publisher;
import lombok.RequiredArgsConstructor;

import java.util.TimerTask;

@RequiredArgsConstructor
public class PublishTask extends TimerTask {

	private final Publisher publisher;

	@Override
	public void run() {
		publisher.publish();
	}
}
