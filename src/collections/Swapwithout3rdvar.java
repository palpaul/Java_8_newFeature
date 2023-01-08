package collections;

public class Swapwithout3rdvar {
	public static void main(String[] args) {
		int a =10 ;
		int b =20;
		//swapped value using third var
//		int temp =a;
//		a=b;
//		b=temp;
//		System.out.println(a);
//		System.out.println(b);
		//without using third variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a is swapped : " +a);
		System.out.println("value of b is swapped : " +b);
	}

}
