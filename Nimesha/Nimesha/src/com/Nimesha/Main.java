package com.Nimesha;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("abc", 30, "male", "hr"));
		employees.add(new Employee("def", 20, "male", "developer"));
		employees.add(new Employee("ghi", 35, "female", "hr"));
		employees.add(new Employee("jkl", 25, "male", "developer"));
		employees.add(new Employee("mno", 23, "female", "developer"));
		
		employees.stream().map(Employee::getName).distinct().forEach(System.out::println);
		
		Map<String, Long> employeecount = 	employees.stream().
			collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println("Count of different departments------>"+employeecount);
		
		Map<String, Double> avgAge = employees.stream().
				collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println("Average age of employees------>"+avgAge);
		
		List<Employee> sortedemployeeList = employees.stream().
				sorted((o1, o2)->(o2.getAge()-o1.getAge())).collect(Collectors.toList());
		sortedemployeeList.stream().map(Employee::getAge).forEach(System.out::println);
	}
}
