package com.palyground.java10;

import java.util.List;

/*
 * Java compiler infers the type of the variable at the compile time based on the right hand assignment
 * Can be made final - ex final var myVariable
 * var can be used in loops
 * var cannot be assigned with null
 * var is not a keyword
 * 
 * @author XKS9
 *
 */
public class LocalVariableTypeInferences {

	public static void main(String[] args) {
		var list = List.of(List.of(1, 2));// var is inferred as list of lists

		for (var i : list) {
			for (var j : i) {
				System.out.println(j);
			}
		}
	}

}
