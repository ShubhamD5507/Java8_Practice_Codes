package com.demo.stringpractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachFromListOfString {

	public static void main(String[] args) {

		
		List<String> list = Arrays.asList("abc", "pqr", "xyz", "mnop");
		
		List<String> str = list.stream().map(s -> new StringBuffer(s).reverse().toString()).collect(Collectors.toList());

		System.out.println(str);
		
	}
}
