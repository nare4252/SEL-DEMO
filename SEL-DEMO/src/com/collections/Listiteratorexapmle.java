package com.collections;
import java.util.ArrayList;
import java.util.ListIterator;

public class Listiteratorexapmle {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("Nare");
		arrayList.add("Sai");
		arrayList.add("pandi");

		System.out.println("second pos element is " + " " + arrayList.get(2));

		System.out.println("Iterating the elements in forward direction");
		ListIterator itr = arrayList.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		System.out.println("in backward direction");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());

		}

	}
}
