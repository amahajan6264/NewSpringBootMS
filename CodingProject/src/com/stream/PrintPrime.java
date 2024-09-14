package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintPrime {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 4

		        , 6, 8, 10, 11, 12, 13, 14, 15);

		numbers.stream().map(i -> Math.sqrt(i))
		        .collect(Collectors.toList())
		        .forEach(System.out::println);

	}
}
