package string;

import java.util.Scanner;

public class Print_Prime_Num {

	public static void main(String[] args) {
		//int n=20;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the range of number which oyu wnat to print the prime number");
		int num = sc.nextInt();
		int temp=0;
		if(num>100) {
			System.out.println("please enter range below 100 ok ");
		}
		else {
			for(int i=2;i<=num;i++) {
				for(int j=2;j<=i/2;j++) {
					
					if(i%j==0) {
						temp=temp+1;
					}
				}//inner loop closed
				if(temp==0) {
					System.out.print(i+ " ");
				}
				else temp=0;
			}
	
		}
		
}
}