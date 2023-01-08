package methodRefrences;

import java.sql.Struct;

public class MethodReferenceDemo {
	public static void main(String[] args) {
		System.out.println("Learning Method references...");
			// normally without method reference we are doing like this 
		// provide the implementation of WorkInterface
		WorkInterface workInter = ()->{
			//providing specific implementation for the doTask method  wich is defined in WorkInterface Interface ok
			System.out.println("this is do Task new method");
		}; // we have to put semicolon after thi
		//now calling doTask() Method
		workInter.doTask();  
	
	// using method references what we have to do we simple refer the method here replacing the lambda expression
		//here do stuff method is a static so giving hte class name and using :: for metohd refrence
		// now wil get hte bodu do doStuff method which we want to give implementation using metohd reference
		
		//static method refer
		//class name :: metohd name without paranthes (without bracket )
		WorkInterface workInter2 = Stuff::doStuff;
		//now call the same method whihc is in interface we are not provingd any implementation here 
		// we just refereing the implemataion whihc is define in the Stuff class and doStuff mewthod okk .
		
		workInter2.doTask();
		
		//now we have a another existing method we ewant to refer ok
		
		Runnable runnable= Stuff::threadTask;
		Thread t = new Thread(runnable);
		t.start();
		
		// now we are trrying to refer the non static method so we need obj of that class right
	
		//Referring non static method 
		// objname :: mewtohdNmae
		Stuff stufObj = new Stuff();
		//now we refer with the help of obj
		Runnable runnable2 = stufObj::printNumber;
		Thread t1 = new Thread(runnable2);
		t1.start();
		
		// NOte-- basically we are overriding the doTask method by using method reference sothe arguments should be smae which is define in interface methos and which we are referring 
		// toTask() && doStuff() both a no arg so both have same arg we can refer .
		//return type may be different no issue on that
 	}

}
