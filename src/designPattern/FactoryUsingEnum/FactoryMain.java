package designPattern.FactoryUsingEnum;

import java.util.Scanner;

public class FactoryMain {
	public static void main(String[] args) {
		System.out.println("Press 1 for ANDROID");
		System.out.println("Press 2 for IOS");
		System.out.println("Press 3 for WINDOWS");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n < 0 || n > 3) {
			System.out.println("Invalid Input");
		} else {
			// because enum indexing start with 0
			OS os = OsFactory.getInstance(OSType.values()[n - 1]);
			os.specs();
		}

	}

}
