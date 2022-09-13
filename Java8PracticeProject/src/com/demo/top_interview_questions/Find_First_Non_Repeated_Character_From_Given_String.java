package com.demo.top_interview_questions;

import java.util.*;
import java.util.stream.*;
import java.util.function.Function;
import java.util.function.Supplier;


public class Find_First_Non_Repeated_Character_From_Given_String {

	public static void main(String[] args) {
		
		 String input = "Java Hungry Blog Alive is Awesome";

		 Set<Character> chars = new HashSet();
		 
         Character result = input.chars() // Stream of String       
                   .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
                   .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
                   .entrySet()
                   .stream()
                   .filter(entry -> entry.getValue() == 1L)
                   .map(entry -> entry.getKey())
                   .findFirst()
                   .get();
         System.out.println(result+"\n\n\n"); 
         
         
     //   List<Character> set= input.chars().mapToObj((c)-> Character.toLowerCase((char)c)).filter((c)-> !chars.add(c)).collect(Collectors.toList());
         
       //  System.out.println("Set ----> : "+set);
		

	}

}
