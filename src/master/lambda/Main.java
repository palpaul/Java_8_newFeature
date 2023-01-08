package master.lambda;

import javax.sound.midi.Soundbank;

public class Main {
	public static void main(String[] args) {
		System.out.println("My system starts...");
		
		// its normal use of use interface  as before 
		MyInterImpl obj = new MyInterImpl();
		//or
		MyInter obj2 = new MyInterImpl();
		obj.sayHello();
		obj2.sayHello();
		
		// or we can use this interface making an annonmous class
		
		MyInter i1 = new MyInter() {
			@Override
			public void sayHello() {
			System.out.println("This is first anonmyous class");				
			}
		};
		//calling this abstract method whic is created in functional interface
		i1.sayHello();
	   

		// suppose we need to give another implementation then sipmay will create and another obj
		//and call the methods dotn need to create another class this is the use of inteface adn annmousmus clalss
		MyInter i2 = new MyInter() {
			
			@Override
			public void sayHello() {
				System.out.println("this is second anonous class");
			}
		};
		i2.sayHello();
		
		// by using  function interface with the help of lambda function
		MyInter i=()->{
			System.out.println("using lambda funcation");
		};
		i.sayHello();
		//provided another implementation 
		MyInter ii=()->System.out.println("second time using lambda");
		ii.sayHello();
}
}