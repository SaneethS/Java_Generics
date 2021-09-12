package com.maximumproblem;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		System.out.println("Welcome to java generics maximum problem");
		
		String xstr = "Apple", ystr = "Peach", zstr = "Banana", wstr = "Watermelon";//Test Case 1
		Integer xInt = 100, yInt = 45, zInt = 32, wInt = 123;//Test Case 2
		Float xFlt = 80.98f, yFlt = 12.6f, zFlt = 56.78f, wFlt = 98.9f;//Test Case 3
		
		new Maximum().maximum(xstr,ystr,zstr,wstr);
		new Maximum().maximum(xInt,yInt,zInt,wInt);
		new Maximum().maximum(xFlt,yFlt,zFlt,wFlt);
	}

}
