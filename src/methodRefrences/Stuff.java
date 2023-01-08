package methodRefrences;

import java.time.LocalDate;
import java.util.Locale;

public class Stuff {
	
	public static void doStuff() {
		System.out.println("Im doing Task");
		System.out.println("Im secod line");
		LocalDate now  = LocalDate.now();
		System.out.println(now.toString());
	}
	
	public static void threadTask() {
		for(int i =1;i<=10;i++) {
			System.out.println(i*2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	//non static metohd ok
	public void printNumber() {
		for(int i =1;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
