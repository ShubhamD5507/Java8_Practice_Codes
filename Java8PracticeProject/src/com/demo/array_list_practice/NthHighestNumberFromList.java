package com.demo.array_list_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NthHighestNumberFromList {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			
			list.add(i);
			}
		System.out.println(list);
		
		Optional<Integer> nth_num = list.stream().sorted().skip(2).findFirst();
		System.out.println(nth_num.get() );
	}
}