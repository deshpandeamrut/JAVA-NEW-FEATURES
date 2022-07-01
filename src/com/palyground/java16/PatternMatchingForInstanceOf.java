package com.palyground.java16;

public class PatternMatchingForInstanceOf {
	public static void main(String[] args) {

		Object s = "hello";
		
		/**
		 * Old way
		 */
		if(s instanceof String) {
			String s1 = (String) s;
			System.out.println(s1);
		}
		
		
		/**
		 * New way
		 */
		
		if(s instanceof String s2) {
			System.out.println(s2);
		}
	}
}
