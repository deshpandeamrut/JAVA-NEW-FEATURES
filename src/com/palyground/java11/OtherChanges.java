package com.palyground.java11;

/**
 * 1. Run a java file with single command
 * 
 * <pre>
 * ex - java MyClass.java
 * </pre>
 * 
 * Java internally compiles the MyClass.java file and runs it. Earlier we had to
 * compile the .java files with javac command then run the compiled file using
 * java file.class
 * 
 * 2. Epsilon (Experimental) - Unlike the JVM GC which is responsible for
 * allocating memory and releasing it, Epsilon only allocates memory. Now
 * Elipson is good only for test environments. It will lead to OutOfMemoryError
 * in production and crash the applications.
 * 
 * The benefit of Elipson is no memory clearance overhead. Hence it’ll give an
 * accurate test result of performance and we can no longer GC for stopping it.
 *
 * 3. Java Flight Recorder (JFR)
 * - It is now open sourced 
 * 
 * 4. HTTP CLient
 * Java 11 standardizes Http client Api which was released in old version (9 or 10)
 * @author Amrut
 *
 */
public class OtherChanges {

	public OtherChanges() {
		// TODO Auto-generated constructor stub
	}
}
