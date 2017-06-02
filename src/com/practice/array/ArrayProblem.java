package com.practice.array;

import java.util.HashMap;

public class ArrayProblem {

	public static int findKthSmallestFromTwoSortedArray(int[] arr1,int[] arr2,int k){
		int len1=arr1.length;
		int len2=arr2.length;
		if(k> len1+len2) return -1;
		int i=0,j=0,count=0;
		int temp = -1;
		while(count<k){
		    if(arr1[i]<arr2[j]){
                temp=arr1[i];
		        i++;
            }else{
		        temp=arr2[j];
		        j++;
            }

            count++;
        }

		return temp;
	}
	

    public static int[] findAllPairForaGivenSum(int[] arr, int sum){
		int len = arr.length;
        if(arr==null){
            return new int[]{0,0};
        }
		HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<len;i++){
            if(map.containsKey(arr[i])){
                return new int[]{i,map.get(arr[i])};
            }else{
                map.put(sum-arr[i],i);
            }
        }
        return new int[]{0,0};
	}
	
	public static void main(String[] args) {
		int[] arr1={1,4,6,8,9};
		int[] arr2={2,3,4,6,7,8,9};
		int[] arr3 = {3,6,8,2,1,4,4,0,5};
		int i = findKthSmallestFromTwoSortedArray(arr1, arr2, 6);
		System.out.println(i);
        int[] ints = findAllPairForaGivenSum(arr3, 8);
        System.out.println("Index for the sum= 8 ares ");
        for(int j:ints){
            System.out.print(j+" ");
        }
    }
}
