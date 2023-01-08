package string;

public class This_And_Super {
	
	String s= "Parent variable";
	public static void main(String[] args) {
		Child obj = new Child();
		obj.m1();
	}
}
class Child extends This_And_Super{
String s= "Child variables"	;
//this and super keyword cant use inside static methods  ok
// here if we make m1 method as static then it will through compile time error
public void m1() {
	System.out.println(s);// by default it will access child class instance/obj var ok
	System.out.println(this.s);// access child class instance/obj var ok
	System.out.println(super.s);//access parent class instance/obj var ok
	
	
}

}

