package com.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
class Employee implements Comparable<Employee> {
	private String name;
	private int age;
	private double salary;

	@Override
	public int compareTo(Employee o) {
		System.out.println(this + "    " + o + "  " + Double.compare(this.getSalary(), o.getSalary()));
		return Double.compare(this.getSalary(), o.getSalary());
	}
}

public class Test {
	public static void main(String[] args) {
		/*List<Employee> employees = Arrays.asList(
		        new Employee("John", 25, 30000),
		        new Employee("Jane", 35, 75000),
		        new Employee("Akshay", 40, 75000),
		        new Employee("Jake", 45, 60000),
		        new Employee("Laura", 31, 85000),
		        new Employee("Tom", 28, 20000),
		        new Employee("rami", 28, 25000),
		        new Employee("rameshm", 28, 28000));
		
		List<Employee> employeeNames = employees.stream()
		        .filter(e -> true) // Filter employees with age > 30
		        .sorted((e1, e2) -> {
			        System.out.println(e1 + "      " + e2);
			        return Double.compare(e1.getSalary(), e2.getSalary());
		        }) // Sort by salary in descending order
		           // .map(Employee::getName) // Map to employee names
		        .collect(Collectors.toList()); // Collect to a list
		System.out.println("+++++++++++++===============");
		employeeNames.forEach(System.out::println);
		System.out.println("+++++++++++++===============");
		Collections.sort(employees);*/
		List<Integer> ts = new ArrayList<>();
		ts.add(10);
		ts.add(0);
		ts.add(20);
		ts.add(32);
		ts.add(20);
		ts.add(40);

		Comparator<Integer> cmp = (o1, o2) -> {
			System.out.println("(" + o1 + "," + o2 + ")" + "  " + Integer.compare(o2, o1));
			return Integer.compare(o1, o2);
		};

		Collections.sort(ts, cmp);

		ts.forEach(System.out::println);

	}
}
