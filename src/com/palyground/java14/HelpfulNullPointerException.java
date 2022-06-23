package com.palyground.java14;

/**
 * From java 14 the null pointer excpetion messages are more helpful with clear error msg on what was null
 * @author Amrut
 *
 */
public class HelpfulNullPointerException {

	public static void main(String[] args) {
		
		String s1 = null;
		
		s1.trim();// throws NPE with more info
		/**
		 * Exception in thread "main" java.lang.NullPointerException: 
		 * Cannot invoke "String.trim()" because "s1" is null
		 */
		
		MyClass myclass = new MyClass();
		myclass.name.split(" ");
		/**
		 * Exception in thread "main" java.lang.NullPointerException: 
		 * Cannot invoke "String.split(String)" because "myclass.name" is null
		 */
	}
}


class MyClass {
	String name;
}