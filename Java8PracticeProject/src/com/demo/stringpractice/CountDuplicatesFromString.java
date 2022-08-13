package com.demo.stringpractice;
import java.util.Map;
import java.util.stream.Collectors;

import javafx.util.Pair;

public class CountDuplicatesFromString {

	public static void main(String[] args) {
		
		String str = "JavaJavaEE";
		
	Map<Character, Long> count = str.chars().mapToObj(c-> (char)c)
			.collect(Collectors.groupingBy(c-> c, Collectors.counting()));

	//	System.out.println(count);

	count.forEach((k, v)-> {
		
		System.out.println(k+" : "+v);
	});
	
	}
}