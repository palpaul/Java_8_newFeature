package string;

import java.util.Scanner;

public class FindOccuranceInGivenString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String...");
		String str = sc.nextLine();
		int initialLength = str.length();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Character to find out the Occurances...");
		String str1= sc1.next();
		str= str.replace(str1, "");
		int finalLength = str.length();
		System.out.println("Total no of Occarance of character of "+str1+ " : " +"is : "+(initialLength-finalLength));
		
	}
}
