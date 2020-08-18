package com.mythread.demos;

public class ThreadDemo extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("run method");
		System.out.println(currentThread().getName());
		
		for(int i=1; i<21; i++) {
			System.out.println(i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		ThreadDemo td= new ThreadDemo();
		td.run();
		//System.out.println(Thread.currentThread().getName());
	}
}
