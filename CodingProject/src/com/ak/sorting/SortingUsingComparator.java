package com.ak.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import lombok.Data;

public class SortingUsingComparator {
	public static void main(String[] args) {

		// Creating an empty ArrayList of Student type
		ArrayList<Student> ar = new ArrayList<Student>();

		// Adding entries in above List
		// using add() method
		ar.add(new Student(111, "Mayank", "london"));
		ar.add(new Student(131, "Anshul", "nyc"));
		ar.add(new Student(121, "Solanki", "jaipur"));
		ar.add(new Student(101, "Aggarwal", "Hongkong"));
		Collections.sort(ar);
		System.out.println("===========Without sorting the data==============");
		ar.forEach(System.out::println);
		System.out.println("===========with sorting the data using the rollno========");
		ar.sort(new  SortByRollno());
		ar.forEach(System.out::println);
		System.out.println("===========with sorting the data using the name========");
		ar.sort(new  SortByName());
		ar.forEach(System.out::println);
		
	}
}

@Data
class Student implements Comparable<Student> {
	int rollno;
	String name;
	String city;

	Student(int rollno, String name, String city) {
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.rollno-o.rollno;
	}
}

class SortByRollno implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		System.out.println(o1.rollno+"=============="+o2.rollno);
		System.out.println(o1.rollno+"=============="+o2.rollno);
		return o1.rollno - o2.rollno;
	}

}
class SortByName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		System.out.println(o1.name+"+++++++++++"+o2.name);
		System.out.println(o1.name+"+++++++++++"+o2.name);
		return o1.name.compareTo(o2.name);
	}
	
}