package com.demo.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class NthHighestEmployeeSalary {

	public static void main(String[] args) {

		List<Employees> emp = new ArrayList<Employees>();
		
		emp.add(new Employees(101, "Shubham", 21, 15000, "Java"));
		emp.add(new Employees(101, "vaibhav", 23, 25000, "PHT"));
		emp.add(new Employees(101, "Swapnil", 32,  35000, "C#"));
		emp.add(new Employees(101, "Onkar", 22, 45000, "CPP"));
		emp.add(new Employees(101, "Rohit", 35, 55000, "Python"));
		 
		Optional<Double> opt = emp.stream().map(e-> e.getSalary()).sorted().skip(2).findFirst();
		System.out.println(opt.get());
	}
}
