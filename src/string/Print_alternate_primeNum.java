package string;

import java.util.Scanner;

public class Print_alternate_primeNum {

public static void main(String[] args) {
	
	//int n=20;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the range of number which oyu wnat to print the prime number");
	int num = sc.nextInt();
	int temp=0,k=0;

		for(int i=2;i<=num;i++) {
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					temp=temp+1;
				}
			}//inner loop closed
			if(temp==0) {
				//this cond for to printing hte alternative prime number
				if(k%2==0) {
				//here printing prime number
				System.out.print(i+ " ");
				}
				k++;
			}
			else temp=0;
		} // outer loop closed

	}
	
}
