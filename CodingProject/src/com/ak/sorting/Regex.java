package com.ak.sorting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[^abc]");
		Matcher m = p.matcher("abd");
		System.out.println(m.matches());
		while (m.find()) {
			System.out.println(m.start() + "...." + m.end() + "...." + m.group());
		}

		String input = "abcdmnopxyz";
		String pattern = "[a-a[bd]]";

		Pattern compiledPattern = Pattern.compile(pattern);
		Matcher matcher = compiledPattern.matcher(input);

		while (matcher.find()) {
			System.out.println("Found: " + matcher.group());
		}

		String email = "hello_World@geeksforgeeks.org";
		String regex = "^[a-zA-Z0-9+-]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,6}$";

		Pattern pattern1 = Pattern.compile(regex);
		Matcher matcher1 = pattern1.matcher(email);

		boolean isEmailValid = matcher1.matches();

		if (isEmailValid) {
			System.out.println("Email is valid");
		} else {
			System.out.println("Email is invalid");
		}

	}
}