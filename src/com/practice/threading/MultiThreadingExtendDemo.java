package com.practice.threading;

public class MultiThreadingExtendDemo extends Thread{
	
	public void run(){
		System.out.println("Running Thread");
	}
	
	public static void main(String[] args) {
		MultiThreadingExtendDemo threadingDemo = new MultiThreadingExtendDemo();
		threadingDemo.start();
	}

}
