package com.ak;

import java.util.ArrayList;
import java.util.List;

public class CompratorUsingLamdaExp {
	public static void main(String[] args) {
		final int x=20;
		Runnable r=()->System.out.println(x);
		//x=10;
		// Create a list of strings
        List<String> names = new ArrayList<>();
        names.add("Charlie");
        names.add("Alice");
        names.add("Bob");
        r.run();
        names.sort(String::compareTo);
        
        System.out.println(names);
        
        
		
	}
}
