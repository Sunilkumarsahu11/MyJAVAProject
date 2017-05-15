package com.practice.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map<String,Integer> tm = new TreeMap<String,Integer>();
		tm.put("k1",32);tm.put("k4",24);tm.put("k5",42);tm.put("k7",31);
		tm.put("k2",93);tm.put("k3",20);tm.put("k6",46);tm.put("k8",26);
		Set<String> ks = tm.keySet();
		Iterator<String> it = ks.iterator();
		System.out.println("TreeMap keys are sorted");
		while(it.hasNext()){
			String key = it.next();
			System.out.println("Key "+ key+" value : " + tm.get(key));
		}
		
		Iterable<Integer> values = tm.values();
		for (Integer integer : values) {
			System.out.println(integer);
		}
		
	}

}
