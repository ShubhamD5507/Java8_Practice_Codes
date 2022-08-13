package com.demo.salimprog;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CapitalizingFirstCharacterFromEachWord {

	public static void main(String[] args) {

		
		List<String> list = Arrays.asList("abc", "pqr", "xyz", "mnop");
		
		List<String> str = list.stream().map(s-> s.toUpperCase()
				.substring(0, 1).concat(s.substring(1))).collect(Collectors.toList());
		System.out.println(str);
		
	}

}
