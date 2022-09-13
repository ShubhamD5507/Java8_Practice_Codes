package com.demo.top_interview_questions;

import java.util.Arrays;
import java.util.List;

public class Find_Highest_Number_From_Given_List {

	public static void main(String[] args) {
		
		   List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
          
		   
		   // Approach 01
		   myList.stream().max((I1 ,I2)-> I1.compareTo(I2)).ifPresent((n)-> System.out.println(n));
		   
		   System.out.println("\n\n");
		   
		   // Approach 02
		   List<Integer> myList1 = Arrays.asList(10,15,8,49,25,98,98,32,15);
           int max =  myList1.stream()
                            .max(Integer::compare)
                            .get();
           System.out.println(max);              
	}

}
