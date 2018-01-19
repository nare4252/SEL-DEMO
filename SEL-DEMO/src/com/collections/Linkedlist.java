package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
	
	
	
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Nare");
		linkedList.add("Pandi");
		linkedList.add("Swoyam");
		
		Iterator iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
		
		for (String string : linkedList) {
			System.out.println(string);
		}
		
		

	}

}
