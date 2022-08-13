package com.demo.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class NthHighestEmployeeSalary {

	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<Employee>();
		
		emp.add(new Employee(101, "Shubham", 15000, "Java"));
		emp.add(new Employee(101, "vaibhav", 25000, "PHT"));
		emp.add(new Employee(101, "Swapnil", 35000, "C#"));
		emp.add(new Employee(101, "Onkar", 45000, "CPP"));
		emp.add(new Employee(101, "Rohit", 55000, "Python"));
		
		Optional<Integer> opt = emp.stream().map(e-> e.getSalary()).sorted().skip(2).findFirst();
		System.out.println(opt.get());
	}
}
