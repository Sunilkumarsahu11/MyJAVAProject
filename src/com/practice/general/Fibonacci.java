package com.practice.general;

public class Fibonacci {
	static int fibID[]=new int[100];
	public int fibonnaci1(int x){
		if(x==0){
			return 0;
		}
		if(x==1){
			return 1;
		}
		
		return fibonnaci1(x-1)+fibonnaci1(x-2);
	}
	
	public int fibonacciBoottomUp(int x){
		int fib[]=new int[x+1];
			fib[0]=0;
			fib[1]=1;
			System.out.print("0 1");
			for (int i = 2; i < x+1; i++) {	
				fib[i]=fib[i-1]+fib[i-2];
				if(fib[i]<0){
					fib[i]=0;
					break;
				}
				System.out.print(" "+fib[i]);
			}
			return fib[x]!=0?fib[x]:-1;	
	}
	
	
	public int fibonacciTopDown(int x){
		
		if(x==0){
			return 1;
		}
		if(x==1){
			return 1;
		}
		if(fibID[x]!=0){
			return fibID[x];
		}else{
			fibID[x]=fibonacciTopDown(x-1)+fibonacciTopDown(x-2);
		}
		return  fibID[x];
	}

	public static void main(String[] args) {
		int x=1;
		Fibonacci obj = new Fibonacci();
//		System.out.println(obj.fibonnaci1(6));
		System.out.println(obj.fibonacciBoottomUp(100));
//		System.out.println(obj.fibonacciTopDown(7));
		System.out.println(Integer.MAX_VALUE);
	}
}
