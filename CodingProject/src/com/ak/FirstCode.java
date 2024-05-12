package com.ak;

import java.util.ArrayList;

public class FirstCode {
	public static void main(String[] args) {
		ArrayList<Long> al=new ArrayList<>();
		al.add(12l);
		Long l;
		l=(Long)al.get(0);
		System.out.println(al+"============"+l);
	}
}
