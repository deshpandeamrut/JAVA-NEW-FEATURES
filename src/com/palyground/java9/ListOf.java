package com.palyground.java9;

import java.util.List;
import java.util.Map;

/**
 * Oracle Corp has introduced some convenient factory methods to create
 * Immutable List, Set, Map and Map.Entry objects. These utility methods are
 * used to create empty or non-empty Collection objects.
 * 
 * In Java SE 8 and earlier versions, We can use Collections class utility
 * methods like unmodifiableXXX to create Immutable Collection objects. For
 * instance, if we want to create an Immutable List, then we can use
 * Collections.unmodifiableList method.
 * 
 * However, these Collections.unmodifiableXXX methods are a tedious and verbose
 * approach. To overcome those shortcomings, Oracle Corp has added a couple of
 * utility methods to List, Set and Map interfaces.
 * 
 * @author Amrut
 *
 */
public class ListOf {

	public static void main(String[] args) {
		/* Create immutable empty list */
		List<String> list = List.of();
		System.out.println(list);
		
		List<String> sList = List.of("1","2");
		
//		list.add("ACD");//throws exception
		
		Map myMap = Map.of(1,"one",2,"two");
		
		System.out.println(myMap.get(2));
		
		
	}

}
