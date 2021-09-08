package com.maximumproblem;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to java generics maximum problem");
		
		String xstr = "Apple", ystr = "Peach", zstr = "Banana";//Test Case 1
		Integer xInt = 100, yInt = 45, zInt = 32;//Test Case 2
		Float xFlt = (float) 80.98, yFlt = (float) 12.6, zFlt = (float) 56.78;//Test Case 3
		
		new Maximum(xstr,ystr,zstr).maximum();
		new Maximum(xInt,yInt,zInt).maximum();
		new Maximum(xFlt,yFlt,zFlt).maximum();
	}

}
