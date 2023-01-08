package customException;

//first create a custom exception class by extending Exception class
public class NameNotFoundException extends Exception {
	NameNotFoundException(String errorMessage){
		super(errorMessage);
	}

}
/*
 * Note that we also have to provide a constructor that takes a String as the 
 * error message and called the parent class constructor.

This is all we need to do to define a custom exception.

Next, let’s see how we can use the custom exception in our example:*/


