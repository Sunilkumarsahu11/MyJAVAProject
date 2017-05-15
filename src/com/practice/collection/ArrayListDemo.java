package com.practice.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("str1");
		al.add("str4");
		al.add("str3");
		al.add("str2");
		al.add("str6");
		al.add("str5");
		al.add("str7");
		al.add("str8");

		for (String string : al) {
			System.out.println(string);
		}

		try {
			al.remove(al.size() - 1);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Out Of index");
		}
		
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());
		}

	}

}
