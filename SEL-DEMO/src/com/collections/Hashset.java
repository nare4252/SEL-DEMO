package com.collections;

import java.util.HashSet;
import java.util.Iterator;


public class Hashset {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Ravi");
		hashSet.add("Ravi");
		hashSet.add("Nare");
		
		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}

}
