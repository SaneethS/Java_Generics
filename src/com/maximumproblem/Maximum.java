package com.maximumproblem;

import java.util.*;

/**
 * @author saneeths
 *this is the class where the maximum  values are found out the generic function is formed
 *and the comparable class is extended
 * @param <T>
 */
public class Maximum<T extends Comparable<T>> {
	List<T> list = new ArrayList<T>();//List used to store the parameters
	
	/**
	 * @param t this method is created to add the parameters to the list and to call
	 * the max value function here the option method is used for parameters 
	 * 
	 */
	public T maximum(T...t) {
		for(T i: t) {
			list.add(i);
		}
		return Maximum.maximumValue(list);
	}

	/**
	 * This is the method where the maximum value is found out among the list of parameters
	 * Here the sorting mathod is used to find the maximum value
	 * 
	 */
	private static <T extends Comparable<T>> T maximumValue(List<T> parameters) {
		int n = parameters.size();
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<n-i-1 ; j++) {
				if(parameters.get(j).compareTo(parameters.get(j+1))>1) {
					T temp = parameters.get(j);
					parameters.set(j, parameters.get(j+1));
					parameters.set(j+1, temp);
				}
			}
		}
		T max = parameters.get(n-1);
		printMax(parameters,max);
		return max;
	}

	/**
	 * This method is created to display the maximum value which is internally called 
	 * by maximum method
	 */
	private static<T> void printMax(List<T> parameters, T max) {
		StringBuilder builder = new StringBuilder();
		builder.append("Max Value among ");
		for(T i: parameters) {
			builder.append(i+",");
		}
		builder.append(" : "+max);
		System.out.println(builder);
	}
}
