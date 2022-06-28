package com.palyground.java9;

/**
 * In Java 8, we can provide method implementation in Interfaces using Default
 * and Static methods. However we cannot create private methods in Interfaces.
 * 
 * To avoid redundant code and more re-usability, Oracle Corp is going to
 * introduce private methods in Java SE 9 Interfaces. From Java SE 9 onwards, we
 * can write private and private static methods too in an interface using a
 * ‘private’ keyword.
 * 
 * These private methods are like other class private methods only, there is no
 * difference between them.
 * 
 * @author Amrut
 *
 */
public interface PrivateMethods {

	private void myMethod() {
		System.out.println("hello");
	}
	
	private static void myStaticMethod() {
		System.out.println("Hi");
	}
}
