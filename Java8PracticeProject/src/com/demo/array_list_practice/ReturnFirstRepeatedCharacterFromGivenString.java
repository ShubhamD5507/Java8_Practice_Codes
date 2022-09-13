package com.demo.array_list_practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ReturnFirstRepeatedCharacterFromGivenString {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		String str = "ZBACDFSVV";
		
		boolean repeated = false;
		
		char[] c = str.toCharArray();
		
		System.out.println(Arrays.toString(c));
		
		for(int i=0; i<=c.length; i++) {
		
			for(int j =i+1; j<c.length; j++) {
	
				if(c[i]==c[j]) {

					System.out.println("First Repeated Character : "+c[i]);
					repeated = true;
					break;
				}
			}
			if(repeated==true) {
				return;
			}
		}
	}
}
