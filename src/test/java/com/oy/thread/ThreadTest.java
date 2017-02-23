package com.oy.thread;

public class ThreadTest {
	public static void main(String[] args) {
//		RunnableDemo demo1 = new RunnableDemo("thread1");
//		demo1.start();
//		
//		RunnableDemo demo2 = new RunnableDemo("thread2");
//		demo2.start();
		
		ThreadDemo t3 = new ThreadDemo("thread3");
		t3.start();
		ThreadDemo t4 = new ThreadDemo("thread4");
		t4.start();
	}
}

class RunnableDemo implements Runnable {
	private Thread thread;
	private String threadName;

	public RunnableDemo(String threadName) {
		System.out.println("creating " + threadName);
		this.threadName = threadName;
	}

	@Override
	public void run() {
		System.out.println("running " + threadName);
		for (int i = 4; i > 0; i--) {
			System.out.println("thread " + threadName + ", " + i);
		}
		System.out.println("exiting "+ threadName);
	}
	
	public void start(){
		System.out.println("starting " + threadName);
		if (thread == null) {
			thread = new Thread(this, threadName);
			thread.start();
		}
	}
}

class ThreadDemo extends Thread {
	private Thread thread;
	private String threadName;

	public ThreadDemo(String threadName) {
		System.out.println("creating " + threadName);
		this.threadName = threadName;
	}

	@Override
	public void run() {
		System.out.println("running " + threadName);
		for (int i = 4; i > 0; i--) {
			System.out.println("thread " + threadName + ", " + i);
		}
		System.out.println("exiting "+ threadName);
	}
	
	public void start(){
		System.out.println("starting " + threadName);
		if (thread == null) {
			thread = new Thread(this, threadName);
			thread.start();
		}
	}
}