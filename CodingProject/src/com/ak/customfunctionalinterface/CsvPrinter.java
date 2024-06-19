package com.ak.customfunctionalinterface;

public class CsvPrinter {
	public static void main(String[] args) {
		printService print=()->"akshay";
		System.out.println(print.print());
	}
}
