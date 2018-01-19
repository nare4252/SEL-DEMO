package com.asserts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DemoArray implements Comparable<String>{

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Janurary");
		arrayList.add("March");
		arrayList.add("Febrauary");
		arrayList.add("june");
		Collections.sort(arrayList);
		for (String string : arrayList) {
			System.out.println(string);
		}
		

	}

	@Override
	public int compareTo(String o) {
		
		return 0;
	}

}
