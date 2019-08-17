package com.test;

import java.util.concurrent.ArrayBlockingQueue;

public class Producer implements Runnable{
	private ArrayBlockingQueue<Integer> queue;

	public Producer(ArrayBlockingQueue<Integer> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {

		while(true) {
			try {
				Thread.sleep(5000);
				queue.put(Main.counter++);
				System.out.println("Value added " + Main.counter);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
}
