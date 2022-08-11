package com.collection.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
     List<String> words = new ArrayList<String>();
		
        
     words.add("RoyalEnfield");  
     words.add("H2RH2");  
     words.add("RX100");  
     words.add("Pulsar");
     words.add("Yamaha");
     words.add("s1000");
     words.add("Ninja");
     words.add("Ducatti");
     words.add("BMWS2");
	
		
		printWord(words);

	}

	public static void printWord(List<String> words)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the word length:");
		
		int length=sc.nextInt();
		
		
		for (int i=0;i<words.size();i++) {
			
		String n=words.get(i);
		
		if(n.length()==length)
			{
				System.out.println(n);
			}
		}
	}
}