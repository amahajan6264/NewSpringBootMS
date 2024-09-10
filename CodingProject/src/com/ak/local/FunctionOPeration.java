package com.ak.local;

import java.util.function.Function;

public class FunctionOPeration {
	public static void main(String[] args) {
		Function<String, String> fn = (i) -> {
			StringBuilder sb = new StringBuilder(i);
			return sb.reverse().toString().toUpperCase();
		};
		String reverseString=fn.apply("Akshay");
		System.out.println(reverseString);
	}
	
}
