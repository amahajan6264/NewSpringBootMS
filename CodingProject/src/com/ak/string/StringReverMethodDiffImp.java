package com.ak.string;

import java.util.Collections;
import java.util.stream.Collectors;

public class StringReverMethodDiffImp {

	public static String reverseStringthroughSB(String value) {
		return new StringBuilder(value).reverse().toString();
	}

	public static String reverStringThrougForLoop(String value) {
		String reverse = "";
		for (int i = value.length() - 1; i >= 0; i--) {
			reverse = reverse + value.charAt(i);
		}
		return reverse;
	}

	public static String revereStringThroughWhileLoop(String value) {
		String reverse = "";
		int len = value.length();
		while (!(len == 0)) {
			len--;
			reverse = reverse + value.charAt(len);
		}
		return reverse;
	}

	public static String revereStringThroughDoWhileLoop(String value) {
		String reverse = "";
		int len = value.length();
		do {
			len--;
			//System.out.print(len + "");
			reverse = reverse + value.charAt(len);
		} while (!(len == 0));
		return reverse;
	}

	public static String reverseStringUsingStreams(String value) {
	    return value.chars()                          // Convert the string to an IntStream
	                .mapToObj(c -> (char) c)          // Convert each int to a Character object
	                .collect(Collectors.collectingAndThen(
	                    Collectors.toList(),          // Collect the characters into a list
	                    lst -> { 
	                        Collections.reverse(lst);  // Reverse the list
	                        //lst.forEach(System.out::print);
	                        return lst.stream();      // Create a stream from the reversed list
	                    }
	                ))
	                .map(String::valueOf)             // Convert each character back to a string
	                .collect(Collectors.joining());   // Join all characters into a single string
	}
	public static void main(String[] args) {
		String value = "Akshay";
		String reverseWord = null;
		reverseWord = reverseStringthroughSB(value);
		System.out.println("Reverse through String builder : " + reverseWord);
		reverseWord = reverStringThrougForLoop(value);
		System.out.println("Reverse through for loop : " + reverseWord);
		reverseWord = revereStringThroughWhileLoop(value);
		System.out.println("Reverse through while loop : " + reverseWord);
		reverseWord = revereStringThroughDoWhileLoop(value);
		System.out.println("Reverse through do while loop : " + reverseWord);
		reverseWord = reverseStringUsingStreams(value);
		System.out.println("Reverse through stream  : " + reverseWord);
	}

}
