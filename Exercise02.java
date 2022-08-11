package com.collection.demo;

import java.util.ArrayList;
import java.util.List;

public class Exercise02 {

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

for(String word:words) {

if(word.length()==5)
{
System.out.println(word);
}
}
}


}