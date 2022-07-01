package com.palyground.java16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The aim is to reduce the boilerplate with some commonly used Stream
 * collectors, such as Collectors.toList and Collectors.toSet:
 * 
 * @author Amrut
 *
 */
public class StreamToList {

	public static void main(String[] args) {
		List<Integer> iList = Arrays.asList(1, 2, 3, 4, 5);

		/** Before Java 16 */

		List<Integer> filteredList1 = iList.stream().takeWhile(i -> i < 3).collect(Collectors.toList());

		/** Java 16 */

		List<Integer> filteredList2 = iList.stream().takeWhile(i -> i < 3).toList();
	}
}
