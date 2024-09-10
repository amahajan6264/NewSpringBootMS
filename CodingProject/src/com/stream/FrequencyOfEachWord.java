package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachWord {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");

		Map<String, Long> wordFrequency = words.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("=======================================");
		words.forEach(System.out::println);
		System.out.println("=======================================");
		wordFrequency.forEach((t, u) -> {
			System.out.println(u + "====" + t);
		});
		System.out.println("=======================================");
		peek();
	}

	public static void peek() {
		int[] array = { 4, 2, 7, 1, 5, 3, 6 };
		int k = 10; // Find the 3rd smallest element
		int kthSmallest = Arrays.stream(array)
				.sorted()
				.peek(i -> {
					System.out.println(i);
				}).skip(k - 1)
				.findFirst()
				.orElse(-1);
		System.out.println("=======================================");
		System.out.println(kthSmallest);
		
	}
}
