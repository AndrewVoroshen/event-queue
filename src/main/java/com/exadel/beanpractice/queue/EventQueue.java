package com.exadel.beanpractice.queue;

import com.exadel.beanpractice.event.Event;
import com.exadel.beanpractice.subscriber.Subscriber;
import lombok.RequiredArgsConstructor;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@RequiredArgsConstructor
public class EventQueue {

	private final List<Subscriber> subscribers;

	private Queue<Event> eventQueue = new LinkedList<>();

	public void put(Event event) {
		eventQueue.add(event);
	}

	public Event peek() {
		return eventQueue.peek();
	}
}
