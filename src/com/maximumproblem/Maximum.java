package com.maximumproblem;

public class Maximum {
	Integer x;
	Integer y;
	Integer z;
	
	public Maximum(Integer x, Integer y, Integer z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Integer maximum() {
		return Maximum.maximum(x,y,z);
	}

	private static Integer maximum(Integer x2, Integer y2, Integer z2) {
		Integer max = x2;
		
		if(y2.compareTo(max)>0)
			max = y2;
		if(z2.compareTo(max)>0)
			max = z2;
		display(x2,y2,z2,max);
		return max;
	}

	private static void display(Integer x2, Integer y2, Integer z2, Integer max) {
		System.out.println("Max of "+x2+", "+y2+" and "+z2+" = "+max);
	}
	
}
