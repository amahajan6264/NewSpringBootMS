package com.ak.reflact;

public class ReflactEx {
	static int i;
	
	static  {
		i=10;
		y=10;
	}
	static int y;
	
	static {
		System.out.println(i + " "+y);
	}
	
	public static void main(String[] args) {
		
	}
}
