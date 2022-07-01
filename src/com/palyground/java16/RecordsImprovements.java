package com.palyground.java16;
/**
 * Records is still a preview feature
 * @author XKS9
 *
 */
public class RecordsImprovements {

}

class Outer {
	public record Employee(String id, String name) {
	};

	class InnerClass {
		Employee emp = new Employee("id", "name"); // this employee record can be accessed from inner class which was
													// missed in earlier release
	}
}