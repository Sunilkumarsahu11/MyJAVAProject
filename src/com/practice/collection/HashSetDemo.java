package com.practice.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		hs.add("key1");
		hs.add("key2");
		hs.add("key3");
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println(hs.contains("key1"));
		System.out.println(hs.contains("key4"));
		
	}
}
