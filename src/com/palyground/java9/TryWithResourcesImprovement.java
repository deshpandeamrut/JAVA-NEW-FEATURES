package com.palyground.java9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * <pre>
 * We know, Java SE 7 has introduced a new exception handling construct:
 * Try-With-Resources to manage resources automatically. The main goal of this
 * new statement is “Automatic Better Resource Management”.
 * 
 * RULES
 * 	1. Any Resource (which Pre-defined Java API class or User Defined class) must implement java.lang.AutoCloseable.
 *	2. Resource object must refer either final or effectively final variable
 *	3. If Resource is already declared outside the Try-With-Resources Statement, we should re-refer with local variable (As shown in the above Example-1 code)
 * 	4. That newly created local variable is valid to use within Try-With-Resources Statement.
 * 
 * Java SE 9 is going to provide some improvements to this statement to avoid
 * some more verbosity and improve some Readability.
 * 
 * In Java SE 9, if we have a resource which is already declared outside the
 * Try-With-Resource Statement as final or effectively final, then we do NOT
 * need to declare a local variable. We can use previously created variable
 * within Try-With-Resource Statement without any issues as shown below:
 * </pre>
 * @author Amrut
 *
 */
public class TryWithResourcesImprovement {

	public static void main(String[] args) throws IOException {

		TryWithResourcesImprovement ob = new TryWithResourcesImprovement();
		ob.readFileJava7();
		ob.readFileJava9();
	}

	public void readFileJava7() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("./resources/hello.txt"));
		try (BufferedReader br2 = br) {
			System.out.println(br.readLine());
		}
	}

	public void readFileJava9() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("./resources/hello.txt"));
		try (br) {
			System.out.println(br.readLine());
		}
	}
}
