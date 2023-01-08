package string;

import java.util.Scanner;

public class NumPrimeOrNot {	
	public static void main(String[] args) {
		//int num =5;
		int temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int nn = sc.nextInt();
		for(int i=2;i<nn/2;i++) {
			if(nn%i==0) {
				temp = temp+1;
			}
		}
		if(temp>0) {
			System.out.println(nn + " is Not Prime number");
		}else System.out.println(nn + "is Prime number");
		
	}

}
