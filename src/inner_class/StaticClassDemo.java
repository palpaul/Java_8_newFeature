package inner_class;

 public class StaticClassDemo {
	 
	 static class staticinnerDemo{
		 
		 int a = 10;
		 String str ="Hii";
		 public static void show() {
			 System.out.println("Im insde the static inner class ok so dotn need to make an obj");
		 }
		 
	 }
	 public void outershow() {
		 System.out.println("Im outer class");
	 }
	 
	public static void main(String[] args) {
		StaticClassDemo obj = new StaticClassDemo();
		obj.outershow();
		staticinnerDemo.show();
		StaticClassDemo.main(12);
		
	}
	// overloading main method so arg should be diff then only can we overload any static method
	//cant override the sttic method ok because static methods is bound with compile time
	public static void main(int a) {
		 a =10;
		System.out.println(a);
	}

}

/*Can we declare a class Static in Java? Top Level and Nested static class Example
The answer to this question is both Yes and No, depending on whether you are talking about a top-level class or a nested class in Java. You cannot make a top-level class static in Java, the compiler will not allow it, but you can make a nested class static in Java. A top-level class is a class that is not inside another class. It may or may not be public like you can have more than one class in a Java source file and only needs to be public, whose name must be the same as the name of the file, rest of the class or interface on that file may or may not be public. On the other hand, a nested class is a class inside a top-level class. It is also known as the inner class or member class in Java.


Now, let's think about what is the meaning of static class, why would someone want to make a class static in Java? If you are familiar with the concept of a static method and static variable in Java, then you know that anything static can be accessed without creating an instance of the class.

For example, you can access the static variable directly as ClassName.variable and you can invoke the static method as ClassName.staticMethod(), this is a great convenience for calling utility method or accessing constants.

This convenience is the main reason Java programmers like to declare a nested class as static in Java. Remember, A nested class, if it's not static then you can't create its instance without first creating an instance of the outer class, which is a bit inconvenient. Such classes are known as the Inner class and they are always associated with an instance of the outer class.


Read more: https://javarevisited.blogspot.com/2017/04/can-we-declare-class-static-in-java.html#ixzz7avwS7JYU*/

