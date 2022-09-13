package com.demo.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Calculate_Average_Age_And_Salary_of_Employee {

	public static void main(String[] args) {
		
		List<Employees> emp = new ArrayList<Employees>();
		
		emp.add(new Employees(101, "Shubham", 21, 15000, "Java"));
		emp.add(new Employees(101, "vaibhav", 23, 25000, "PHT"));
		emp.add(new Employees(101, "Swapnil", 32,  35000, "C#"));
		emp.add(new Employees(101, "Onkar", 22, 45000, "CPP"));
		emp.add(new Employees(101, "Rohit", 35, 55000, "Python"));
		 
		
		Double avg_age = emp.stream().collect(Collectors.averagingInt(Employees::getAge));
		
		System.out.println(avg_age);
		
		Double avg_sal = emp.stream().collect(Collectors.averagingDouble(Employees::getSalary));
		
		System.out.println(avg_sal);
		
		Stream.of(21,24,25,15,17,18).max((I1, I2)-> I1.compareTo(I2)).ifPresent(num -> System.out.println(num));

		//Stream.of(21,24,25,15,17,18).max((I1,I2)-> (I1>I2)?1:(I1<I2)?-1:0)).ifPresent(num -> System.out.println(num));
	}

}
