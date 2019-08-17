package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.ArrayBlockingQueue;

public class Consumer implements Runnable{
	private ArrayBlockingQueue<Integer> queue;

	public Consumer(ArrayBlockingQueue<Integer> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {

		while(true) {
			try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
				//Thread.sleep(1000);
				//queue.take();
				//BufferedReader br = new BufferedReader(new FileReader("test.txt"));
				//br.close();
				
				System.out.println("Value removed " + Main.counter);
				Main.counter--;
			} catch(Exception e) {
				
			}
		}
		
	}
	
	
}
