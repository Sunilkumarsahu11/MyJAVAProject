package com.practice.regex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMobileNumberFromFile {
	
	public static int count =0;
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("F:/eclipse/workspace/PRACTICE/input1.txt");
			BufferedReader br = new BufferedReader(fr);
			String line=br.readLine();
			
			Pattern p = Pattern.compile("[\\s]");
			
			
			while(line!=null){
//				System.out.println(line);
				Matcher m = p.matcher(line);
				while(m.find()){
					System.out.println(m.start()+" " + m.end() +" "+ m.group());
					count++;
				}
				line=br.readLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Total count :"+count);
	}

}
