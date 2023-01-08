package competative;

public class StaticVsNonSctaic {
	
	//if non static var declare out side of the static method  then we can't use it
	// if non static var declare inside the static method then we can use it.
	
	static int num =5;
	int num2=2;
	public static void show() {
		int num3=3;
		System.out.println(num);
		//System.out.println(num2);
		
		System.out.println(num3);
	}
	public static void main(String areg []) {
		StaticVsNonSctaic.show();
	}

}
