package functionalInter;
@FunctionalInterface
public interface FunclInterface {
	//only one abstract method but it can have any number of 
	//default method and static method ok
	
	//1)abstract method  don't have body
	public void show();
	
	//2) default method
	default int sumNum(int a, int b) {
		//a=5;
		//b=6;
		int c=a+b;
		System.out.println(c);
		return c;
		
	}
	
	//3) static method
	public static void helloStatic() {
		System.out.println("Im static method");
	}
	

}
