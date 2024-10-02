package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListMerge {
	public static void main(String[] args) {
		List<Integer> listone = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		List<Integer> listtwo = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		List<Integer> listthree = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 9);

		List<Integer> merge = Stream.of(listone, listtwo, listthree)
		        .flatMap(Collection::stream)
		        .sorted()
		        .distinct()
		        .collect(Collectors.toList());
		System.out.println("merge the three list in sorted order in distinct");
		System.out.println(merge);

		/*===========================================================================*/
		System.out.println("Fist Non-repeated number in list");
		Integer first = merge.stream()
		        .collect(
		                Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()))
		        .entrySet()
		        .stream()
		        // .peek(e -> System.out.println(e.getKey() + " " + e.getValue()))
		        .filter(e -> e.getValue() == 1)
		        .map(Map.Entry::getKey)
		        .findAny()
		        .orElse(null);
		System.out.println(first);

		/*===========================================================================*/

		int n = 9;

		System.out.println("N the largest value");
		Integer nthLargestValue = merge.stream()
		        .sorted()
		        .skip(n - 1)
		        .findFirst()
		        .orElse(null);
		System.out.println(nthLargestValue);

		/*===========================================================================*/

		System.out.println("Reverse elements in groups of k using the stream");
		var list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

		var k = 3;
		// divide the list of chunks into k
		List<Integer> divide = IntStream.range(0, (list1.size() + k - 1) / k)
		        .peek(e -> System.out.println(e))
		        .mapToObj(i -> {
			        System.out.println(i * k + " " + Math.min((i + 1) * k, list1.size()));
			        return list1.subList(i * k, Math.min((i + 1) * k, list1.size()));
		        })
		        .peek(e -> System.out.println(e))
		        .flatMap(sublist -> {
			        var tmp = new ArrayList<>(sublist);
			        Collections.reverse(tmp);
			        return tmp.stream();
		        })
		        .peek(e -> System.out.println(e))
		        .collect(Collectors.toCollection(ArrayList::new));

		System.out.println(divide);

		System.out.println("Intstream start");
		IntStream i = IntStream.rangeClosed(1, 4);
		// 1+2+3+4+5
		/*System.out.println(i.reduce(8, (a, b) -> {
			System.out.println(a + " "+ b);
			return a + b;
		}));*/
		// System.out.println(i.sum());
		/// System.out.println(i.average());

		/*System.out.println(i.allMatch(x -> {
			System.out.println(x);
			return x % 2 == 0;
		}));*/
		
		i.forEach(System.out::println);

	}
}
