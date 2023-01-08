package string;

public class This_Cons_And_Super_Cons {
	
	This_Cons_And_Super_Cons(){
		System.out.println("hi im parent constructor");
	}
	
	public void m1() {
		System.out.println("im parent method");
	}
public static void main(String[] args) {
	ChildClass obj = new ChildClass();
	obj.m1();
	obj.c1();

}
}

class ChildClass extends This_Cons_And_Super_Cons{
	ChildClass(){
		System.out.println("Im chaild class constructor");
	}
	public void c1() {
		System.out.println("im child method");
	}
	
}

class exp extends Child{
	
}
