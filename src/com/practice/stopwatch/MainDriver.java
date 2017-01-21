package com.practice.stopwatch;

public class MainDriver {

	public void startThreadTimer() {
		StopWatch stopWatch = new StopWatch();
		stopWatch.startTimer();
		Thread th = new Thread(stopWatch);
		th.start();

		try {
			// th.join();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stopWatch.stopTimer();

	}

	public void startStopWatchApplication() {
		

	}

	public static void main(String[] args) {
		MainDriver md = new MainDriver();
		// md.startThreadTimer();

	}
}
