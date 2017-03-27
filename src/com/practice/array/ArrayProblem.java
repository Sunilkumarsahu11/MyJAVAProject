package com.practice.array;

public class ArrayProblem {

	public static int findKthSmallestFromTwoSortedArray(int[] arr1,int[] arr2,int k){
		
		return 0;
	}
	
	public static void findAllPairForaGivenSum(int[] arr,int sum){
		
	}
	
	public static void main(String[] args) {
		int[] arr1={1,4,6,8,9};
		int[] arr2={2,3,4,6,7,8,9};
		int[] arr3 = {3,6,8,2,1,4,4,0,5};
		int i = findKthSmallestFromTwoSortedArray(arr1, arr2, 5);
		System.out.println(i);
		findAllPairForaGivenSum(arr3, 8);
	}
}
