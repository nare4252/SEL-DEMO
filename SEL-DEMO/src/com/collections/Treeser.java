package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeser {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("2");
		set.add("2");
		set.add("3");
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}

	}

}
