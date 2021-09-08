package com.maximumproblem;

public class Maximum {
	String x;
	String y;
	String z;
	
	public Maximum(String x, String y, String z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public String maximum() {
		return Maximum.maximum(x,y,z);
	}

	private static String maximum(String x2, String y2, String z2) {
		String max = x2;
		
		if(y2.compareTo(max)>0)
			max = y2;
		if(z2.compareTo(max)>0)
			max = z2;
		display(x2,y2,z2,max);
		return max;
	}

	private static void display(String x2, String y2, String z2, String max) {
		System.out.println("Max of "+x2+", "+y2+" and "+z2+" = "+max);
	}
	
}
