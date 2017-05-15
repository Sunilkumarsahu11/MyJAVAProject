package com.practice.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import sun.font.CreatedFontTracker;

public class HashMapDemo {

	public Map<String, String> createMap(){
		
		Map<String,String> map= new HashMap<String,String>();
		
		map.put("k1","v1");
		map.put("k2","v2");
		map.put("k3","v3");
		return map;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapDemo demo = new HashMapDemo();
		Map<String, String> map = demo.createMap();
		System.out.println("****Using iterator over key set********");
		printMap(map);
		
		System.out.println("****Using iterator over values********");
		Collection<String> values = map.values();
		Iterator<String> iterator = values.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			System.out.println(map.hashCode());
		}
		
		System.out.println(map.containsKey("k1"));
		System.out.println(map.containsKey("ks1"));
		
		
	}

	public void sorthashMapByVal(){
		HashMap<String, Integer> countMap = new HashMap<String, Integer>();
		//add a lot of entries
		countMap.put("a", 4);
		countMap.put("b", 2);
		countMap.put("s", 3);
		countMap.put("e", 1);
		ValueComparator vc =  new ValueComparator(countMap);
		TreeMap<String,Integer> sortedMap = new TreeMap<String,Integer>(vc);
		 
		sortedMap.putAll(countMap);  
		 
		printMap(sortedMap);
	}
	private static  void printMap(Map map) {
		// TODO Auto-generated method stub
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()){
			String next = it.next();
		System.out.println("key: "+next+" Value "+map.get(next));
		}
	}

}
