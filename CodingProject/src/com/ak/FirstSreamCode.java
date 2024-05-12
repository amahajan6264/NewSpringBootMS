package com.ak;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstSreamCode {
	public static void main(String[] args) {
		List<Integer> str=Arrays.asList(1,2,3,4);
		str.forEach(System.out::println);
		
		List<Integer> ls=(List<Integer>)str.stream().filter(x->x>2).map(x->x+2).collect(Collectors.toList());
		System.out.println(ls);
	}
}
