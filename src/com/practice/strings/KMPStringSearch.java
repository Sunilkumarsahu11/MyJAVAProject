package com.practice.strings;

public class KMPStringSearch {

	KMPStringSearch(String str,String pattern){
		
	}
	
	 
	private int[] computeTemporaryArray(char pattern[]){
		 int[] tmpArr = new int[pattern.length];
		 int index=0;
		 for (int i=1;i<pattern.length;){
			 if(pattern[i]==pattern[index]){
				 tmpArr[i]=index+1;
				 index++;
				 i++;
			 }else{
				 if(index!=0){
					 index = tmpArr[index-1];
				 }else{
					 tmpArr[i]=0;
					 i++;
				 }
			 }
		 }
		 
		 return tmpArr;
	 }
	
	public int KMPSearch(){
		
		return 0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcxabaaabcabcy";
		String pattern ="abcab";
		
		

	}

}
