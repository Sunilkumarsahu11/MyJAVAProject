package com.practice.general;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WaysToCoinChange {
	public static int dynamic(int[] v, int amount) {
		int[][] solution = new int[v.length + 1][amount + 1];

		// if amount=0 then just return empty set to make the change
		for (int i = 0; i <= v.length; i++) {
			solution[i][0] = 1;
		}

		// if no coins given, 0 ways to change the amount
		for (int i = 1; i <= amount; i++) {
			solution[0][i] = 0;
		}

		// now fill rest of the matrix.

		for (int i = 1; i <= v.length; i++) {
			for (int j = 1; j <= amount; j++) {
				// check if the coin value is less than the amount needed
				if (v[i - 1] <= j) {
					// reduce the amount by coin value and
					// use the subproblem solution (amount-v[i]) and
					// add the solution from the top to it
					solution[i][j] = solution[i - 1][j]
							+ solution[i][j - v[i - 1]];
				} else {
					// just copy the value from the top
					solution[i][j] = solution[i - 1][j];
				}
			}
		}
		return solution[v.length][amount];
	}

	public static void main(String[] args) {
//		int amount = 5;
//		int[] v = { 1, 2, 3 };
//		System.out.println("By Dynamic Programming " + dynamic(v, amount));
		
		Map<String,String> map = new HashMap<String, String>();
		map.put("key", "value");
		map.put("key1", "va1lue");
		map.put("key2", "val2ue");
		map.put("ke4y", "valu4e");
		map.put("key3", "value3");
		for(Map.Entry<String,String> entry:map.entrySet()){
			System.out.print(entry.getKey() +":"+entry.getValue() +" ");
			
		}
		map.remove("key");
		map.size();
		map.containsKey("key");
		map.containsValue("value");
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.println("Iterator");
		Iterator entries = map.entrySet().iterator();
		while(entries.hasNext()){
			System.out.print(" "+entries.next());
			
		}
		
	}

}