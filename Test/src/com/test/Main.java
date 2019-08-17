package com.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

interface Lambda{
	public void demo();
	public void demo2();
}

public class Main {
	
	public static int counter = 1;
	
	public static void main(String[] args) throws InterruptedException {
		
		Lambda ob = ()->{
			System.out.println("Hello 1");
			System.out.println("Hello 2");
		};
		ob.demo();
		
	}

}
