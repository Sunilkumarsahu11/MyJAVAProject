package com.practice.sorting;

public class MyQuickSort {
	private int[] numArray={5,3,7,4,1,8,0,9,6};

	public void quickSortArray(int low,int high) {
		// TODO Auto-generated method stub
		int pivot = numArray[low + (high-low)/2];
		int i=low;
		int j=high;
		
		while(i<=j){
			while(numArray[i]<pivot){
				i++;
			}
			while(numArray[j]>pivot){
				j--;
			}
			
			if(i<=j){
				swapNumbers(i,j);
				i++;
				j--;
			}
			
		}
	
		if(low < j){
			
			quickSortArray(low, j);
		}
		if(high >i){
			
			quickSortArray(i, high);
		}
		

	}
	
	private void quicksort2(int low,int high) {
		// TODO Auto-generated method stub
		int i=low;
		int j=high;
		int pivot= numArray[low+(high-low)/2];
		while(i<=j){
			while(pivot > numArray[i]){
				i++;
			}
			while(pivot < numArray[j]){
				j--;
			}
			swapNumbers(numArray[i], numArray[j]);
		}
		
		if(low <j){
			quicksort2(low, j);
		}
		
		if(i < high){
			quicksort2(i, high);
		}

	}
	public void swapNumbers(int i, int j){
		int temp = numArray[i];
		numArray[i]=numArray[j];
		numArray[j]=temp;
	}
	private void displayArray() {
		// TODO Auto-generated method stub
		for(int i=0;i<numArray.length;i++){
			System.out.print(numArray[i]+ " ");
		}
		System.out.println("");

	}

	public static void main(String[] args) {
		MyQuickSort qs = new MyQuickSort();
		qs.displayArray();
		qs.quickSortArray(0, qs.numArray.length-1);
		qs.displayArray();
	}
}
