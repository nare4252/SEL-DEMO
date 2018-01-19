package com.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		LinkedHashSet<String> hashSet = new LinkedHashSet<String>();
		hashSet.add("All");
		hashSet.add("All");
		hashSet.add("All");
		hashSet.add("23");
		Iterator iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		

	}

}
