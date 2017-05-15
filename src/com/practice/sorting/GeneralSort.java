package com.practice.sorting;

public class GeneralSort {

	public int[] arraySelectionSort(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < arr.length; i++) {
			int minIndex =i;
			for (int j = i; j < arr.length; j++) {
				if(arr[j]<arr[minIndex]){
					minIndex=j;
				}
				
			}
			int temp = arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
			
		}

		return arr;
	}

	public int[] arrayInsertionSort(int[] arr) {
		
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i],j;
			for (j = i-1; j >= 0 && temp < arr[j]; j--) {
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
		}

		return arr;
	}

	public int[] arrayBubbleSort(int[] arr) {

		int len = arr.length;

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public void printArray(int[] arr) {
		System.out.println("************************");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 5, 9, 2, 1 };
		GeneralSort gs = new GeneralSort();
		gs.printArray(arr);
//		gs.arrayBubbleSort(arr);
//		gs.arraySelectionSort(arr);
		gs.arrayInsertionSort(arr);
		gs.printArray(arr);
	}
}
