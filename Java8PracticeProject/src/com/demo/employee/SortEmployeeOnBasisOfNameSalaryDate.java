package com.demo.employee;

/*
 * sort Employee on basis of Name, Salary and joining Date
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
 
//Implement Comparable to sort Employee on basis of Name, Salary and joining Date
class Employee implements Comparable<Employee> {
    String name;
    Integer salary;
    Date JoiningDate;
 
    public Employee() {
    }
 
    public Employee(String n, Integer f, Date d) {
           name = n;
           salary = f;
           JoiningDate = d;
    }
 
    public String toString() {
           return "\n name=" + name + ",salary=" + salary + ",JoiningDate="
                        + JoiningDate;
    }
 
    public int compareTo(Employee o) {
           return this.name.compareTo(o.name) + (this.salary.compareTo(o.salary))
                        + (this.JoiningDate.compareTo(o.JoiningDate));
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Date getJoiningDate() {
		return JoiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		JoiningDate = joiningDate;
	}
    
}
 
public class SortEmployeeOnBasisOfNameSalaryDate {
 
    public static void main(String[] args) {
 
           Employee emp1 = new Employee("ank", 2000, new Date(2016 - 1900, 11, 14));
           Employee emp2 = new Employee("dav", 500, new Date(2016 - 1900, 11, 23));
           Employee emp3 = new Employee("ank", 1000, new Date(2016 - 1900, 11, 22));
           Employee emp4 = new Employee("sam", 9000, new Date(2016 - 1900, 11, 29));
           Employee emp5 = new Employee("ank", 1000, new Date(2016 - 1900, 11, 19));
 
           List<Employee> l = new ArrayList<Employee>();
           l.add(emp1);
           l.add(emp2);
           l.add(emp3);
           l.add(emp4);
           l.add(emp5);
 
           l.stream().sorted((e1, e2)-> e1.getName().compareTo(e2.getName())+e1.getSalary().compareTo(e2.getSalary())+
        		   e1.getJoiningDate().compareTo(e2.getJoiningDate())).collect(Collectors.toList()).forEach(System.out::println);
           
           Collections.sort(l); // SORT
 
           System.out.println(l); // Display list
 
    }
 
}