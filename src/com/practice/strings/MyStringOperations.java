package com.practice.strings;

public class MyStringOperations {
	private String s1;
	private String s2;

	public void setS1(String s1) {
		this.s1 = s1;
	}

	public void setS2(String s2) {
		this.s2 = s2;
	}

	// Swap two string without using third variable
	public void swapTwoStrings() {

		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());

	}

	public void displayTwoSrings() {
		System.out.println("String-1 :" + s1);
		System.out.println("String-2 :" + s2);
	}

	public char firstNonRepeatingChar(String str) {
		char[] charArray = str.toCharArray();
		int countChars[] = new int[256];
		char first = 0;
		for (int i = 0; i < str.length(); i++) {
			int index = Character.getNumericValue(charArray[i]);
			countChars[index]++;

		}

		for (int i = 0; i < str.length(); i++) {
			int index = Character.getNumericValue(charArray[i]);
			if(countChars[index]==1){
				first=charArray[i];
				break;
			}

		}
		System.out.println(first);
		return first;

	}

	public char firstNonRepeatedChar(String str) {
		int[] count = new int[256];
		int[] firstO= new int[256];
		char[] chars = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			int index = Character.getNumericValue(chars[i]);
			if (count[index] == 0){
				count[index]++;
				firstO[index]=i;	
			}	else{
				count[index]++;
			}
		}

		char first = 0;
		int firstIndex = Integer.MAX_VALUE;
		for (int i = 0; i < 256; i++) {
			if (count[i] == 1 && firstO[i] < firstIndex) {
				first = (char) i;
				firstIndex = firstO[i];
			}
		}

		System.out.println(first);
		return first;

	}
	/*	
	 * Reverse a Sentence not words.
	 * for example : this is a boy
	 * Ans: boy a is this
	 * 
	 */
	public String reverseString1(String str){
//		Split all words with space
		
		String[] temp = str.split(" ");
		str="";
//		Read from last and add to str
		for(int i=temp.length-1;i>0;i--){
			str = str+ temp[i]+" ";
		}
		str = str+temp[0];		
		return str;
	}
/*	
 * Reverse a Sentence not words.
 * for example : this is a boy
 * Ans: boy a is this
 * 
 */
	public String reverseString2(String str){
		StringBuffer sb = new StringBuffer(str);
		int startIndex,endIndex;
		for(int i=0;i<str.length();i++){
			startIndex=i;
			while(sb.charAt(i)!=' ' && i<str.length()-1){
				i++;
			}
			endIndex=i==str.length()-1?i:i-1;
			while(startIndex<endIndex){
				char ch = sb.charAt(startIndex);
				sb.setCharAt(startIndex, sb.charAt(endIndex));
				sb.setCharAt(endIndex, ch);
				endIndex--;
				startIndex++;
			}
						
		}
		startIndex=0;
		endIndex=str.length()-1;
		while(startIndex<endIndex){
			char ch = sb.charAt(startIndex);
			sb.setCharAt(startIndex, sb.charAt(endIndex));
			sb.setCharAt(endIndex, ch);
			endIndex--;
			startIndex++;
		}
		str=sb.toString();
		return str;
	}
	
	public String findLongestPalindrom(String str){
		String palind="",temp=null;
		
		if(str==null){
			return  str;
		}
		if(str.isEmpty()){
			return str;
		}
		if(str.length()==1){
			return str;
		}
		for (int i = 0; i < str.length()-1; i++) {
//			get palindrome with center at i
			temp=getlongestPalindrom(str,i,i);
			if(temp.length()>palind.length()){
				palind=temp;
			}
			
//			get palindrome with center at i,i+1
			temp=getlongestPalindrom(str,i,i+1);
			if(temp.length()>palind.length()){
				palind=temp;
			}
			
		}
		
		return palind;
	}
	
	private String getlongestPalindrom(String str, int start1, int start2) {
		
		while(start1>=0 && start2 <str.length() && str.charAt(start1)==str.charAt(start2)){
			start1--;
			start2++;
		}
		//need to take care of index as condition fails. palindrome will be from start1 +1 to start2 -1
		return str.substring(start1+1, start2);
	}

	public String findLongestCommonSubstring(String str1,String str2){
		if(str1==null||str2==null){
			return "";
		}
		int len1=str1.length();
		int len2=str2.length();
		
		int[][] sbArray = new int[len1][len2];
		int max =0,firstindex=0;
		for(int i=0;i<len1;i++){
			for(int j=0;j<len2;j++){
				if(str1.charAt(i)==str2.charAt(j)){
					if(i==0||j==0){
						sbArray[i][j]=1;
					}else {
						sbArray[i][j]=sbArray[i-1][j+1]+1;
					}
					if(max < sbArray[i][j]){
						max=sbArray[i][j];
						firstindex=i;
					}
				}
			}
		}
		
		
		return str1.substring(firstindex-max-1, firstindex);
	}
	public static void main(String[] args) {
		MyStringOperations ms = new MyStringOperations();
		
		/*
		 * ms.setS1("Hello");
		 * ms.setS2("World"); System.out.println("before");
		 * ms.displayTwoSrings(); ms.swapTwoStrings();
		 * System.out.println("after"); ms.displayTwoSrings();
		ms.firstNonRepeatingChar("hello");
		ms.firstNonRepeatedChar("hello");
		 */
//		System.out.println(ms.reverseString1("This is  no. 1 player @ forward position"));
//		System.out.println(ms.reverseString2("This is  no. 1 player @ forward position"));
		System.out.println(ms.findLongestPalindrom("asdfdkaabbccbbaakfjkff"));
		System.out.println(ms.findLongestCommonSubstring("asfdfgdh","sdfkjl"));
	}
	
	
	

}
