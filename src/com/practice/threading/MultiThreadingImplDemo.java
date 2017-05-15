package com.practice.threading;

public class MultiThreadingImplDemo implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Running thread => "+ Thread.currentThread().getName());
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public static void main(String[] args) throws Exception {
		MultiThreadingImplDemo multiThreadingImplDemo = new MultiThreadingImplDemo();
		Thread th = new Thread(multiThreadingImplDemo);
		th.start();
		th.setName("Thread");
		System.out.println(th.getName()+ th.getId()+ th.getPriority());
		th.join();
	}

}
