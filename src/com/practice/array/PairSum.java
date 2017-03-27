package com.practice.array;

class PairSum
{
    private static final int MAX = 100000; // Max size of Hashmap
 
    static void printpairs(int arr[],int sum)
    {
        // Declares and initializes the whole array as false
        boolean[] binmap = new boolean[MAX];
 
        for (int i=0; i<arr.length; ++i)
        {
            int temp = sum-arr[i];
 
            // checking for condition
            if (temp>=0 && binmap[temp])
            {
                System.out.println("Pair with given sum " +
                                    sum + " is (" + arr[i] +
                                    ", "+temp+")");
            }
            binmap[arr[i]] = true;
        }
    }
 
    // Main to test the above function
    public static void main (String[] args)
    {
        int A[] = {15,1, 4, 45, 6, 10, 8};
        int n = 16;
        printpairs(A,  n);
    }
}