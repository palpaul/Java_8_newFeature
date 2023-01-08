package designPattern;

public class BasicSingleton {
	private static BasicSingleton nstance = new BasicSingleton();
	// here if we cant make this instance
	// it coud be break by Reflection api means 2nd obj creation is possible through reflection ok
	private BasicSingleton(){}
	public static BasicSingleton getInstance() {
		return nstance;
	}
}
