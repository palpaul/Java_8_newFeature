package string;

import java.util.Scanner;

public class Armstrong {
 public static void main(String[] args) {
	 //Armstrong number 153, 370, 371, 407
	// 1*1*1+5*5*5+3*3*3 = 153
	 
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number");
	int number = sc.nextInt();
	
	int originalNumber, remainder;
	double result=0;
	
	originalNumber = number;
	while(originalNumber !=0) {
		remainder = originalNumber % 10;
		result = result + Math.pow(remainder, 3);
        originalNumber = originalNumber/10;
        
	}
	if(result == number) System.out.println(number + " is an armstrong number");
	else System.out.println(number + " is Not an armstrong number");
}
}