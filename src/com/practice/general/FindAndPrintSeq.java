package com.practice.general;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class FindAndPrintSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr;
		BufferedReader br;
		Map<String,String> map = new HashMap<String,String>();
		try {
			fr = new FileReader("F:/eclipse/workspace/PRACTICE/input2.txt");
			 br = new BufferedReader(fr);
			String line=br.readLine();
			while(line!=null){
				
				String[] sKV = line.split(" ");
				map.put(sKV[0],sKV[1]);
				
				line=br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e){
			
		}
		
//		Set<Entry<String,String>> entrySet = map.entrySet();
		while(true){
			Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
			if(iterator.hasNext()){
				
				Entry<String, String> next = iterator.next();
				System.out.println();
				String key = next.getKey();
				while(map.get(key)!=null){
					String value =map.get(key);
					System.out.print(key+" ==> "+value);
					map.remove(key);
					key=value;
				}
			}else{
				break;
			}
		}
	}

}
