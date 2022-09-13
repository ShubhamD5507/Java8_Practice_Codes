package com.demo.top_interview_questions;

import java.util.Arrays;
import java.util.List;

public class Find_the_Number_Starting_with_1 {

	public static void main(String[] args) {
		
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        
		 // Approach 01 :-
		 // myList.stream().filter((n)->  (n+"").startsWith("1")).forEach((n)-> System.out.println(n));
		 
		 System.out.println("\n\n");
		 // Approach 02 :-
		 myList.stream().map((n)-> n+"").filter((s)-> s.startsWith("1"))
		 .forEach((n)-> System.out.println(n));
		 
		 boolean x = true;
		 String x1 = String.valueOf(x);
		 
		 System.out.println("Converted to String "+x1);
	}
}