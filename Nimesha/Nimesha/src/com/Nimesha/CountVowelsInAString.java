package com.Nimesha;
import java.util.*;

public class CountVowelsInAString {
	
	public static String countVowels(String s) {
		String str = "";
		int count = 0;
		for(int a = 0; a<s.length(); a++) {
			if(s.charAt(a) == 'a' || s.charAt(a) == 'e' ||
					s.charAt(a) == 'i' || s.charAt(a) == 'o' || 
					s.charAt(a) == 'u' || s.charAt(a) == 'A' ||
					s.charAt(a) == 'E' || s.charAt(a) == 'I' ||
					s.charAt(a) == 'O' || s.charAt(a) == 'U') count++;
		}
		str = str+count;
		return str;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string...");
		String s = sc.next();
		System.out.println(countVowels(s));
		sc.close();
		
	}
}
