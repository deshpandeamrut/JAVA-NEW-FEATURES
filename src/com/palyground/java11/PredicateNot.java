package com.palyground.java11;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNot {

	public static boolean isEven(int number) {
		return number % 2 == 0;
	}

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 5);

		Predicate<Integer> evenPredicate = number -> number % 2 == 0;
		list.stream().filter(evenPredicate).forEach(System.out::println);// prints out even numbers

		/* If we have the negate the predicate, one way is to use nagate() */
		list.stream().filter(evenPredicate.negate()).forEach(System.out::println);// prints out even numbers

		/* Second way of printing using isEven function */

		System.out.println("Even with function");
		list.stream().filter(PredicateNot::isEven).forEach(System.out::println);// prints out even numbers

		/** To negate above we hav eto use Predicate.not */
		System.out.println("Using predicate.not");
		list.stream().filter(Predicate.not(PredicateNot::isEven)).forEach(System.out::println);// prints out even
																								// numbers
	}
}
