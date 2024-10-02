package com.stream;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		Comparator<Integer> cm = (o1, o2) -> 0;
		TreeSet<Integer> ts = new TreeSet<>(cm);
		ts.add(10);
		ts.add(0);
		ts.add(20);
		ts.add(32);
		ts.add(20);
		ts.add(40);

		//ts.forEach(System.out::println);

		TreeSet<Employee> ts1 = new TreeSet<>(Comparator.comparing(Employee::getSalary).reversed());

		ts1.add(new Employee("John", 25, 30000));
		ts1.add(new Employee("Jane", 35, 75000));
		ts1.add(new Employee("Akshay", 40, 75000));
		ts1.add(new Employee("Jake", 45, 60000));

		ts1.forEach(System.out::println);
	}

}

class MyComprator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		System.out.println(o1 + "   " + o2);
		if (o1 < o2) {
			return 1;
		} else if (o1 > o2) {
			return -1;
		} else {
			return 0;
		}
	}

}
