package com.palyground.java10;

import java.util.Arrays;
import java.util.List;

public class CopyOf {
	public static void main(String[] args) {

		List<Integer> iList = Arrays.asList(1, 2, 3);

		List<Integer> copyOfIList = List.copyOf(iList);// this is unmodifiable as copyOfIlist is immuatable

		try {
			copyOfIList.add(4);// throws exception
		} catch (Exception e) {
			e.printStackTrace();
		}

		/**
		 * List.of() vs List.copyOf() List.of takes individual elements instead copyOf
		 * takes entire existing list as a input
		 */

		List<Integer> jList = List.of(1, 2, 3);// unmodifiable as well

	}
}
