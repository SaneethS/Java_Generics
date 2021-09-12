package com.maximumproblem;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		System.out.println("Welcome to java generics maximum problem");
		
		String xstr = "Apple", ystr = "Peach", zstr = "Banana", wstr = "Watermelon";//Test Case 1
		Integer xInt = 100, yInt = 45, zInt = 32, wInt = 12;//Test Case 2
		Float xFlt = 80.98f, yFlt = 12.6f, zFlt = 56.78f, wFlt = 9.9f;//Test Case 3
		
		new Maximum<String>().maximum(xstr,ystr,zstr,wstr);
		new Maximum<Integer>().maximum(xInt,yInt,zInt,wInt);
		new Maximum<Float>().maximum(xFlt,yFlt,zFlt,wFlt);
	}

}
