package com.demo.top_interview_questions;

import java.util.Arrays;
import java.util.List;

public class Find_All_Even_Numbers_From_Given_List_Of_Integers {

	public static void main(String[] args) {

		// Approach 01 :-
		  List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
         
		  myList.stream().filter((n) -> n%2==0).forEach((n) -> System.out.println(n));
		 
		  System.out.println("\n\n");
		  
		// Approach 02 :-
		  List<Integer> myList1 = Arrays.asList(10,15,8,49,25,98,32);
          myList1.stream()
                .filter(n -> n%2 == 0)
                .forEach(System.out::println);
	
		}
	}

