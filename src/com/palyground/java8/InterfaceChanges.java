package com.palyground.java8;

/**
 * Traditionally Java allowed only method declarations in interfaces, the
 * problem with this approach was, if we wanted to add more methods in the
 * interface then all the classes implementing this interface had to implement
 * the newly added method which became difficult to manage.
 * 
 * From Java8 onwards, Java introduced default methods in interfaces
 * 
 * - Java interface default methods will help us in extending interfaces without
 * having the fear of breaking implementation classes. - Java interface default
 * methods has bridge down the differences between interfaces and abstract
 * classes. - Java 8 interface default methods will help us in avoiding utility
 * classes, such as all the Collections class method can be provided in the
 * interfaces itself. - Java interface default methods will help us in removing
 * base implementation classes, we can provide default implementation and the
 * implementation classes can chose which one to override. - One of the major
 * reason for introducing default methods in interfaces is to enhance the
 * Collections API in Java 8 to support lambda expressions.
 * 
 * 
 * JAVA INTERFACE STATIC METHOD - Java interface static method os similar to
 * default methods except that the implementation classes cannot override the
 * implementation of the method. - Helps is avoiding poor implementation
 * 
 * 
 * JAVA FUNCTION INTERFACES - An interface with exactly one abstract method is
 * known as Functional Interface.
 * 
 * A new annotation @FunctionalInterface has been introduced to mark an
 * interface as Functional Interface. @FunctionalInterface annotation is a
 * facility to avoid accidental addition of abstract methods in the functional
 * interfaces. It’s optional but good practice to use it.
 * 
 * @author Amrut
 *
 */
public class InterfaceChanges {

	public static void main(String[] args) {
		TestA testA = new TestA();
		testA.method1();
		testA.method2();
		
		InterfaceChanges ic = new InterfaceChanges();
		ic.demoMethod(new MyFunctionInterface() {
			
			@Override
			public void hello() {
				System.out.println("Implementing hello with annoymous inner class");
			}
		});
		
		
		ic.demoMethod(()-> System.out.println("Hello with lambda!"));
		
	}
	
	public void demoMethod(MyFunctionInterface myFI) {
		myFI.hello();
	}
}

interface Java8Interface {
	void method1();

	default void method2() {
		System.out.println("method2");
	}
	
	static void method3() {
		System.out.println("method3");
	}
}

class TestA implements Java8Interface{

	@Override
	public void method1() {
		System.out.println("mthod1 impl in calss TestA");
	}

	/**
	 * No need to implement method2 as it is default, if needed it can be implemented
	 */
	
	/**
	 * However method2 can be overriden if needed
	 * 
	 */
	@Override
	public void method2() {
		System.out.println("defaukt method - mthod2 impl in calss TestA");
	}	
	
	/**
	 * Method3 cannot be overriden as it is marked as "static"
	 */
}

@FunctionalInterface
interface MyFunctionInterface{
	void hello(); // only one abstarct method hence it is called Functional interface
}