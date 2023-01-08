package designPattern;

public class BasicMain {
	public static void main(String[] args) {
		System.out.println("Verifying singleton or not...! if we get smae instance vlaue then its a singleton");
		System.out.println("Checking BasicSingleton Class");
		BasicSingleton obj1 = BasicSingleton.getInstance();
		BasicSingleton obj2 = BasicSingleton.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
		
		//checking BasicSIngleton2 
		System.out.println("");
		System.out.println("Checking BasicSingleton2 Class this approach can't break by  using reflection api ok");
		System.out.println("it can't break by Reflection api but it will break in multithreaded environment ok");
		BasicSingleton2 obj3 = BasicSingleton2.getInstance();
		BasicSingleton2 obj4 = BasicSingleton2.getInstance();
		System.out.println(obj3);
		System.out.println(obj4);
		System.out.println("");
		System.out.println("Checking BasicSIngleton3 class with multithreaded environment");
		BasicSingleton3 objthreadsafe1 = BasicSingleton3.getInstance();
		BasicSingleton3 objthreadsafe2 = BasicSingleton3.getInstance();
		System.out.println(objthreadsafe1);
		System.out.println(objthreadsafe2);
		
	}

}
