package com.maximumproblem;

public class Maximum {
	Float x;
	Float y;
	Float z;
	
	public Maximum(Float x, Float y, Float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Float maximum() {
		return Maximum.maximum(x,y,z);
	}

	private static Float maximum(Float x2, Float y2, Float z2) {
		Float max = x2;
		
		if(y2.compareTo(max)>0)
			max = y2;
		if(z2.compareTo(max)>0)
			max = z2;
		display(x2,y2,z2,max);
		return max;
	}

	private static void display(Float x2, Float y2, Float z2, Float max) {
		System.out.println("Max of "+x2+", "+y2+" and "+z2+" = "+max);
	}
	
}
