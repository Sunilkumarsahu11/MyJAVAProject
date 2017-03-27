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

	public String reverseString1(String str){
		String[] temp = str.split(" ");
		str="";
		for(int i=temp.length-1;i>0;i--){
			str = str+ temp[i]+" ";
		}
		str = str+temp[0];		
		return str;
	}
	
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
		System.out.println(ms.reverseString1("This is  no. 1 player @ forward position"));
		System.out.println(ms.reverseString2("This is  no. 1 player @ forward position"));
	}
	
	
	

}
