package com.Nimesha;

import java.util.*;

public class ThirdLongestString {
	
	
	public static String longest(String[] sarr) {
		String s = Arrays.stream(sarr)
				.sorted((s1, s2)->Integer.compare(s2.length(), s1.length()))
				.skip(2)
				.findFirst()
				.get();
		return s;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in array...");
		int length = sc.nextInt();
		String[] sarr = new String[length];
		System.out.println("Enter array elements");
		for(int a = 0; a<length; a++) {
			sarr[a] = sc.next();
		}
		System.out.println(longest(sarr));
		sc.close();
	}
}
