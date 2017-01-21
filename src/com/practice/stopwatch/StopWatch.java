package com.practice.stopwatch;

public class StopWatch implements Runnable {
	


	private boolean isRunning ;
	private long starttime;
	private long currentTime;
	
	public long getCurrentTime(){
		this.currentTime=System.currentTimeMillis();
		return currentTime;
	}
	public void startTimer(){
		this.starttime= System.currentTimeMillis();
		this.isRunning=true;
		
	}
	
	public void stopTimer() {
		// TODO Auto-generated method stub
		this.isRunning=false;
	}
	
	public boolean isTimerRunning(){
		return isRunning;
	}
	
	public void resetTimer() {
		// TODO Auto-generated method stub
		this.starttime=System.currentTimeMillis();
	}
	
	public void printCurrentDuration(){
		long timer = getCurrentTime();
		long runningtime = timer-starttime;
		System.out.println(runningtime);
		
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running");
		while(isTimerRunning()){
			printCurrentDuration();			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Exiting now...");

	}
	
	
	
	
	
	

}
