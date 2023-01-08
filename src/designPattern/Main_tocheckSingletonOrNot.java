package designPattern;

public class Main_tocheckSingletonOrNot {
	public static void main(String[] args) {
		SingletonDesignPattern singletonInstance1 = SingletonDesignPattern.getInstance();
		SingletonDesignPattern singletonInstance2 = SingletonDesignPattern.getInstance();
		SingletonDesignPattern singletonInstance3 = SingletonDesignPattern.getInstance();
		System.out.println("if we get all instace value is same theat means singleton is implemented means we have a singleobject only");
		System.out.println(singletonInstance1);
		System.out.println(singletonInstance2);
		System.out.println(singletonInstance3);
	}

}
