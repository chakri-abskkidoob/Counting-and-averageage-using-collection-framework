package com.Nimesha;
import java.util.*;

public class ListOfString {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("One", "two", "three", "four", "five");
		for(int a = 0; a<list.size(); a++) {
			System.out.println("The numer i am having index is :"+a+" and the value is : "+list.get(a));
		}
		
		
		List<String> newlist = new ArrayList<>();
		newlist.add("chakri");
		newlist.add("meghana");
		newlist.add("mayuri");
		newlist.add("yeswanth");
		newlist.add("manoj");
		newlist.add("srinadh");
		
		
		System.out.println(newlist);
	}

}
