package com.palyground.java9;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * <pre>
 * In Java SE 9, Oracle Corp has added four useful new methods to
 * java.util.Stream interface. As Stream is an interface, all those new
 * implemented methods are default methods. Two of them are very important:
 * dropWhile and takeWhile methods
 * 
 * This takeWhile() takes a predicate as an argument and returns a Stream of the
 * subset of the given Stream values until that Predicate returns false for the
 * first time. If the first value does NOT satisfy that Predicate, it just
 * returns an empty Stream.
 * </pre>
 * 
 * @author Amrut
 *
 */
public class StreamApiImprovements {

	public static void main(String[] args) {
		System.out.println("Take While---");
		Stream<Integer> iStream = Stream.of(1, 2, 3, 4, 5);
		iStream.takeWhile(i -> i < 3).forEach(System.out::println);// prints only till matching condition

		System.out.println("Drop While---");
		Stream<Integer> jStream = Stream.of(1, 2, 3, 4, 5);
		jStream.dropWhile(i -> i <= 2).forEach(System.out::println); // prints rest of the elements

		System.out.println("Iterate Method---");
		IntStream.iterate(1, i -> i <= 2, i -> i + 1)
				.forEach(System.out::println); /*
												 * Similar to for loop, first one is initializer, second one termination
												 * condition and third one is increment
												 */

	}

}
