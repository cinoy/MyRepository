package com.test;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable{
	private int threadNo;
	private CountDownLatch latch;

	public int getThreadNo() {
		return threadNo;
	}

	public void setThreadNo(int threadNo) {
		this.threadNo = threadNo;
	}

	public MyThread(int threadNo) {
		this.threadNo = threadNo;
	}

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("i:"+i+" of Thread "+getThreadNo());
			try {
				Thread.sleep(new Random().nextInt(500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/*try {
				sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}
		System.out.println("Thread "+getThreadNo()+" ends..............");
		latch.countDown();
	}
	
	
}
