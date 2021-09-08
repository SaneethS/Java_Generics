package com.maximumproblem;

public class Maximum<T extends Comparable<T>> {
	T x,y,z;
	
	public Maximum(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public T maximum() {
		return Maximum.maximum(x,y,z);
	}

	private static <T extends Comparable<T>> T maximum(T x2, T y2, T z2) {
		T max = x2;
		
		if(y2.compareTo(max)>0)
			max = y2;
		if(z2.compareTo(max)>0)
			max = z2;
		display(x2,y2,z2,max);
		return max;
	}

	private static<T extends Comparable<T>> void display(T x2, T y2, T z2, T max) {
		System.out.println("Max of "+x2+", "+y2+" and "+z2+" = "+max);
	}
	
}
