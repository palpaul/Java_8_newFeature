package inner_class;

class OuterClass {
	
	//associated with out class 
	// we can make inner class as private and protected and static but 
	//can't make out class private and protected and static
	
	private class ABCInner{
		
		int a =10;
		String str ="IM inside inner class";

		 public void sayHello() {
			System.out.println(str);
		}
	}//Innerclass

	int b =20;
	static String str1 = "Im insde the outer class";
	
	static void sayHi() {
		System.out.println(str1);
	}
	
	public static void main(String[] args) {
		OuterClass obj = new OuterClass();
		obj.new ABCInner().sayHello();
		obj.sayHi();
		
	}
}
