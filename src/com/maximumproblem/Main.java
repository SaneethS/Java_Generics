package com.maximumproblem;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to java generics maximum problem");
		
		Integer x = 100, y = 98, z = 75;
		Integer a = 10, b = 98, c = 7;
		Integer p = 10, q = 9, r = 75;
		
		new Maximum(x,y,z).maximum();
		new Maximum(a,b,c).maximum();
		new Maximum(p,q,r).maximum();
	}

}
