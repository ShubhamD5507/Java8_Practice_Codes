package com.demo.stringpractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingDuplicateWordsFromList {

	public static void main(String[] args) {

		List<String> dup = Arrays.asList("abc", "pqr", "abc", "xyz", "pqr");
		
		dup.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
	}
}
