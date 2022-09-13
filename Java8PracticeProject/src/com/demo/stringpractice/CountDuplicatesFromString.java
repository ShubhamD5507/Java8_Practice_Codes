package com.demo.stringpractice;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javafx.util.Pair;

public class CountDuplicatesFromString {

	public static void main(String[] args) {
		
		String str = "JavaJavaEE";
		
	Map<Character, Long> count = str.chars().mapToObj(c-> (char)c)
			.collect(Collectors.groupingBy(c-> c, Collectors.counting()));
	
	String[] strs = str.split("");
	
//	List<String> strings = Arrays.asList(strs);
//	strings.stream().forEach(x->System.out.println(x+":"+Collections.frequency(strings, x)));
	
	System.out.println(Arrays.toString(strs));

	//	System.out.println(count);

	count.forEach((k, v)-> {
		
		System.out.println(k+" : "+v);
	});

	}
}