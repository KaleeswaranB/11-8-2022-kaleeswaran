package com.collection.demo;

import java.util.ArrayList;

public class Exercise01 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(2);
		numbers.add(66);
		numbers.add(9);
		numbers.add(44);
		numbers.add(8);
		numbers.add(1);
		numbers.add(5);
		numbers.add(24);
		numbers.add(7);
		numbers.add(11);
		
	//	Exercise1 obj1 = new Exercise1();
		
	//	int evenSum = obj1.findSum(numbers);
		
		int evenSum = findSum(numbers);
		
		System.out.println("Even Sum = " + evenSum);
		
	/*	for(int i=0; i<number.size(); i++) {
			
			for(number.get(i)%2==0) {
				
			}
				
		}*/
		
	}

	public static int findSum(ArrayList<Integer> numbers) {
		
		int evenSum = 0;
		
		for(int i=0; i<numbers.size(); i++) {
			
			int n = numbers.get(i);
			
			if(n%2==0)
				evenSum = evenSum + n;
		}
		
		return evenSum; 
	}
	
}