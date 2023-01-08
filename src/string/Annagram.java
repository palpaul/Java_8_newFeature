package string;

import java.util.Arrays;
import java.util.Scanner;

public class Annagram {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the string 1");
		String str1 = sc1.nextLine();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("enter the string 1");
		String str2 = sc2.nextLine();
//		
//		String str1 = "Race";
//		String str2 = "Care";
		
		str1=str1.toLowerCase();
		str2= str2.toLowerCase();
		//check if length is same
		
		if(str1.length()==str2.length()) {
			
			//convert strings into char arrays
			char[] chararray1 = str1.toCharArray();
			char[] chararray2 = str2.toCharArray();
			
			// sort the char arrays
			Arrays.sort(chararray1);
			Arrays.sort(chararray2);
			
			//if sorted chararrays are same then string is anagram
		boolean result = Arrays.equals(chararray1, chararray2);
		
		if(result) {
			System.out.println(str1 + " and " +str2 + " are anagram");
		}
		else {
			System.out.println(str1 + " and " +str2 + " are not anagram");
		}
		
		} //if closed
		else System.out.println(str1 +" and " +str2 +" are not anagram");
	}

}
