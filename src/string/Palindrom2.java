package string;

import java.util.Scanner;

public class Palindrom2 {

	public static void main(String[] args) {
		String original,reverse="";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String/number to check if its a palindrome or not");
		original = sc.nextLine();
		int num = original.length();
		for(int i=num-1;i>=0;i--) {
			reverse = reverse+original.charAt(i);
		}
		if(original.equals(reverse))System.out.println( "number/string length is : " +num + " reverse num/string is : " + reverse+ " original num/string is : " + original + " is palindrome");
		else System.out.println("entered num/stirng is not palindrome");
	}
	
}
