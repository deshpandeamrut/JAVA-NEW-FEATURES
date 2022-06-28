package com.palyground.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * A new java.util.stream has been added in Java 8 to perform filter/map/reduce
 * like operations with the collection. Stream API will allow sequential as well
 * as parallel execution. This is one of the best features for me because I work
 * a lot with Collections and usually with Big Data, we need to filter out them
 * based on some conditions.
 * 
 * Collection interface has been extended with stream() and parallelStream()
 * default methods to get the Stream for sequential and parallel execution.
 * 
 * @author Amrut
 *
 */
public class StreamApi {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();

		for (int i = 0; i < 100; i++)
			myList.add(i);

		myList.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

		/**
		 * Parallel stream
		 */
		myList.parallelStream().filter(i -> i % 2 == 0).forEach(System.out::println);

		/**
		 * Return sum for selcted nos.
		 */

		int sum = myList.stream().filter(p -> p > 10).mapToInt(i -> i).sum();
		System.out.println("FIlter and SUM");
		System.out.println("Sum of all nos above 10 - " + sum);

		/**
		 * map() function
		 */

		Stream<String> stream = Stream.of("acv", "acc", "vrl");
		System.out.println("Map function -> upper case conversion");
		List<String> stremList = stream.map(s -> s.toUpperCase()).collect(Collectors.toList());
		stremList.stream().forEach(System.out::println);

		/**
		 * Sorted()
		 */
		Stream<String> stream1 = Stream.of("acv", "acc", "vrl");
		System.out.println("NATURAL SORT---------");
		List<String> sortedList = stream1.sorted().collect(Collectors.toList());
		sortedList.stream().forEach(System.out::println);

		/**
		 * Sort reverse
		 */
		Stream<String> stream2 = Stream.of("acv", "acc", "vrl");
		System.out.println("REVERSE SORT---------");
		stream2.sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);

		/**
		 * FlatMap
		 */

		List<List<String>> listOflists = List.of(List.of("QWE", "RTY", "UIO"), List.of("ASD", "FGH", "JKL"),
				List.of("ZXC", "XCV", "BNM"));
		System.out.println("FLATMAP-----------");
		listOflists.stream().flatMap(p -> p.stream()).forEach(System.out::println);

		/**
		 * REDUCE
		 */
		System.out.println("REDUCE");
		Stream<Integer> str = Stream.of(1, 3, 4, 5);
		Optional<Integer> optionalStr = str.reduce((i, j) -> {
			return i * j;
		});
		if (optionalStr.isPresent())
			System.out.println("Mult- " + optionalStr.get());

		/**
		 * Count
		 */
		Stream<Integer> str1 = Stream.of(1, 3, 4, 5);
		System.out.println("Count-" + str1.count());
		
		/**
		 * MATCH
		 */
		
		Stream<Integer> str2 = Stream.of(1, 3, 4, 5);
		Stream<Integer> str3 = Stream.of(1, 3, 4, 5);
		System.out.println("If 1 is present ?-" + str2.anyMatch(i -> i==1));
		System.out.println("If 2 is present ?-" + str3.anyMatch(i -> i==2));
		
		/**
		 * FIND FIRST
		 */
		Stream<String> str4 = Stream.of("AD","BC","DF","AZ");
		Optional<String> string = str4.filter(s->s.startsWith("A")).findFirst();
		System.out.println(string.get());
		
	}
}
