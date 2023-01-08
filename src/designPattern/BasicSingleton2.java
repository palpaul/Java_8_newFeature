package designPattern;

public class BasicSingleton2 {
	
	//private static BasicSingleton2 instance = new BasicSingleton2();
	// it can't break by Reflection api but it will break in multithreaded environment ok
	//so first change 
	private static BasicSingleton2 instance;
	
	private BasicSingleton2(){
		if(instance!= null) {
			throw new RuntimeException("get you obj by getInstance() method");
		}
	}
	public static BasicSingleton2 getInstance() {
		if(instance== null) {
			instance = new BasicSingleton2();
		}
		return instance;
	}
}
