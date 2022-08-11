package com.collection.demo;
import java.util.*;
public class Exercise04 {

		public static void main(String[] args) {
			ArrayList<String> list=new ArrayList<String>();
			list.add("Lion");
			list.add("Tiger");
			list.add("Cat");
			list.add("Dog");
			list.add("Cow");

			System.out.println(list);

			list.add(3, "Horse"); //add the new animal at the location 3

			System.out.println(list);
		}

	}
