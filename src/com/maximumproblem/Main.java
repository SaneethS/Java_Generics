package com.maximumproblem;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to java generics maximum problem");
		
		Float x = (float) 100.6, y = (float) 98.2, z = (float) 75.3;//Test Case 1
		Float a = (float) 10.67, b = (float) 98.3, c = (float) 7.0;//Test Case 2
		Float p = (float) 10.9, q = (float) 9.8, r = (float) 75.6;//Test Case 3
		
		new Maximum(x,y,z).maximum();
		new Maximum(a,b,c).maximum();
		new Maximum(p,q,r).maximum();
	}

}
