package com.palyground.java11;

public class StringUtilMethods {

	public static void main(String[] args) {
		/** isBlank() method */
		System.out.println("".isBlank());// true
		System.out.println(" ".isBlank());// true
		System.out.println("1".isBlank());// false

		/* StripLeading, StripTrailing */

		System.out.println(" Hello ".stripLeading());// Hello
		System.out.println(" Hello ".stripTrailing());// Hello

		/** .lines(), splits string into multiple lines based on \n */
		"Line1\nLine2\nLine3".lines().forEach(System.out::println);
		
		/** Transform **/
		System.out.println("HELLO".transform(s -> s.toLowerCase()));
		
		/** Formatted **/
		System.out.println("My name is %s and age is %d".formatted("AD007", 30));
	}
}
