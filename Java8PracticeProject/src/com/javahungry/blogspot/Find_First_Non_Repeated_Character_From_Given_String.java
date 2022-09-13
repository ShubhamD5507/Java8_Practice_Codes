package com.javahungry.blogspot;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_First_Non_Repeated_Character_From_Given_String {

	public static void main(String[] args) {

		String input = "Java Hungry Blog Alive is Awesome";
		
		Character result = input.chars().mapToObj(n-> Character.toLowerCase(Character.valueOf((char)n)))
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new , Collectors.counting()))
		.entrySet().stream().filter(entry-> entry.getValue()==1).map(entry-> entry.getKey()).findFirst().get();
		
		System.out.println(Character.toUpperCase(result));
	}

}
