package com.maximumproblem;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to java generics maximum problem");
		
		String x = "Apple", y = "Peach", z = "Banana";//Test Case 1
		String a = "Oreo", b = "Parle", c = "Britania";//Test Case 2
		String p = "Sunsilk", q = "Head and Shoulders", r = "Pantene";//Test Case 3
		
		new Maximum(x,y,z).maximum();
		new Maximum(a,b,c).maximum();
		new Maximum(p,q,r).maximum();
	}

}
