package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listinterface {
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("aend");
		list.add("ajc");
		list.add("asdfjn");
		
		System.out.println("2nd pos is "+" "+list.get(2));
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
		}
	}
}
