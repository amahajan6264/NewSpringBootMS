package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Partition {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		list(numbers);
		Map<Boolean, List<Integer>> group = numbers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));

		group.get(true);
		group.get(false);

		List<String> words = new ArrayList<>(); // Arrays.asList("apple", "banana", "apple", "cherry", "banana",
												// "apple");
		Map<String, Long> wordFrequency = words.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Optional<String> opt = words.stream().max(Comparator.comparingInt(String::length));
		if (opt.isPresent()) {
			System.out.println(opt.get());
		} else {
			System.out.println("Value is not present in the list");
		}

		List<Person> persons = Arrays.asList(new Person("Alice", 25), new Person("Bob", 30), new Person("Charlie", 35));
		double averageAge = persons.stream().mapToInt(Person::getAge).average().orElse(0);
		System.out.println(averageAge);
	}

	@Data
	@AllArgsConstructor
	static class Person {
		String name;
		Integer age;
	}

	public static String list(List<? extends Number> list) {
		System.out.println(list);
		return "";
	}

}
