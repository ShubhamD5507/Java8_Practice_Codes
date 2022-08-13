package com.demo.array_list_practice;

public class RemovingDuplicateCharactersFromString {

	public static void main(String[] args) {

		
		String str = "programming";
		
		StringBuilder sb1 = new StringBuilder();
		
		str.chars().distinct().forEach(s-> sb1.append((char)s));
		
		System.out.println(sb1);
		
	}

}
