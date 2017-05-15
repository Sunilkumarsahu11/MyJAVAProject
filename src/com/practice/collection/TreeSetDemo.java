package com.practice.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<Integer> ts = new TreeSet<Integer>();
		ts.add(82);ts.add(52);ts.add(12);ts.add(21);ts.add(23);ts.add(42);
		ts.add(10);ts.add(29);
		Iterator<Integer> it = ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}
}
