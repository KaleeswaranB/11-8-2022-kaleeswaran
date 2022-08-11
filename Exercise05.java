package com.collection.demo;
import java.util.*;
public class Exercise05 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		 
		ll.addLast("c");
		ll.addLast("C++");
		ll.addLast("Java");
		ll.addLast("Kotlin");
		ll.addLast("Python");
		ll.addLast("Peri");
		ll.addLast("Ruby");
		
		System.out.println(ll);
		
		ll.remove(5); // remove an element at location 5
		
		System.out.println(ll);
		
		ll.remove("Kotlin"); //remove 'Kotlin'
		
		System.out.println(ll);
		
	     LinkedList<String> rl= new LinkedList<String>();
	     rl.addLast("Python");
	     rl.addLast("Peri");
		 rl.addLast("Ruby");
		 
		 ll.removeAll(rl);
		 
		 System.out.println(ll);
	     
		
		ll.clear();  // clear all
		
		System.out.println(ll);
		
		System.out.println(ll.size());
		

	}

}