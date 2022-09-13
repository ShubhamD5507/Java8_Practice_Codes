package com.demo.array_list_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateNumbersFromList {

	public static void main(String[] args) {

		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			
			list.add(i);
			
			if(i==5) list.add(i-1);
			if(i==7) list.add(i-1);
			if(i==2) list.add(i-1);
			if(i==9) list.add(i-1);
			if(i==5) list.add(i-1);
			if(i==7) list.add(i-1);
			if(i==2) list.add(i-1);
			if(i==9) list.add(i-1);
		}
		
		// To check the frequency of numbers from collection
		//use this method -->Collections.frequency(list, 1);  returns --> 3 as 1 repeated 3 times
		
		Set<Integer> set = new HashSet<Integer>();
		
		System.out.println(list);
		
		list.stream().filter(e-> Collections.frequency(list, e)>1).collect(Collectors.toSet())
		.forEach(System.out::println);
		
		// Second way
		
		list.stream().filter(n-> !set.add(n)).collect(Collectors.toSet()).forEach(num-> System.out.println(num));
	}
}
