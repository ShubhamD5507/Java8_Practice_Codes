package com.demo.top_interview_questions;

import java.util.Arrays;
import java.util.List;

public class Count_the_Number_of_Elements_Present_in_List {

	public static void main(String[] args) {
		
		   List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

		 Long count_Of_Numbers =  myList.stream().count();
		 
		 System.out.println(count_Of_Numbers);
	
	}
}
