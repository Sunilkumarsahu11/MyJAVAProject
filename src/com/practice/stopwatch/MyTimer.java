package com.practice.stopwatch;

public class MyTimer  {
	
	private boolean isRunning ;
	private long starttime;
	private long currentTime;
	
	public long getTimer(){
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
	

}
