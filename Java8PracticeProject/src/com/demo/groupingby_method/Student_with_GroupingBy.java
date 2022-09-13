package com.demo.groupingby_method;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

class Student implements Comparator<Student> {

	private String subject;
    private String name;
    private String surname;
    private String city;
    private int age;

    public Student() {
		super();
	
	}
	
    public Student(String subject, String name, String surname, String city, int age) {
		super();
		this.subject = subject;
		this.name = name;
		this.surname = surname;
		this.city = city;
		this.age = age;
	}
	
    public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [subject=" + subject + ", name=" + name + ", surname=" + surname + ", city=" + city + ", age="
				+ age + "]";
	}

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s2.getName().compareTo(s1.getName());
	}

	
}
public class Student_with_GroupingBy {
	
	public static void main(String[] args) {
		
		List<Student> students = Arrays.asList(
			    new Student("Math", "John", "Smith", "Miami", 19),
			    new Student("Programming", "Mike", "Miles", "New York", 21),
			    new Student("Math", "Michael", "Peterson", "New York", 20),
			    new Student("Math", "James", "Robertson", "Miami", 20),
			    new Student("Programming", "Kyle", "Miller", "Miami", 20)
			);
		
		Map<String, List<Student>> studentsBySubject = students
			    .stream()
			    .collect(
			    Collectors.groupingBy(Student::getSubject)
			    );
		System.out.println(studentsBySubject+"\n\n");
		
		
		Map<String, List<String>> studentsByCity = students.stream()
	              .collect(Collectors.groupingBy(
	                  Student::getCity, 
	                  Collectors.mapping(Student::getName, Collectors.toList())));
		
		System.out.println(studentsByCity+"\n\n");
	
		Map<Integer, Long> countByAge = students.stream()
            .collect(Collectors.groupingBy(
                Student::getAge, 
                Collectors.counting()));
	
		System.out.println(countByAge+"\n\n");
		
		Map<String, Long> std1 =students.stream().collect(Collectors.groupingBy(Student::getSubject, Collectors.counting()));
		
		System.out.println(std1+"\n\n");
		
//		Map<String, List<String>> studentsByCit =	students.stream().collect(Collectors.groupingBy(Student::getCity, Collectors.mapping(Student::getName, Collectors.toList() )));
//		System.out.println("Practice -> "+studentsByCit);
		
		TreeMap map = students.stream().collect(Collectors.groupingBy(Student::getCity, ()-> new TreeMap(Collections.reverseOrder()), Collectors.counting()));
		
		System.out.println("Map of Students "+map);
		
	}
}
