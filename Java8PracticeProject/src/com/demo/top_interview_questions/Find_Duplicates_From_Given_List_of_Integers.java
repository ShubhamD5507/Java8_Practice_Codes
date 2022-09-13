package com.demo.top_interview_questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_Duplicates_From_Given_List_of_Integers {

	public static void main(String[] args) {
		
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);		

		 Set<Integer> duplicates = new HashSet<>();
		 myList.stream().filter((n)-> !duplicates.add(n)).forEach(System.out::println);
		
		}
	}
