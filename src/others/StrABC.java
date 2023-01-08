package others;

import org.junit.platform.commons.util.StringUtils;

public class StrABC {
	
	public static void main(String[] args) {
		String str = "R@h123uL KU#";

		char ch[] = str.toCharArray();

		for(int i =0; i<ch.length;i++){
			//remove special characters and space and print the strng and 
			//convert lower case to upaar case without using toUppar case and toLower case methodds
			String str2 = str.toUpperCase();
			System.out.println(str2);
		
			String str1=str.toLowerCase();
			System.out.println(str1);
	//System.out.println(ch);
		}

	}
	
}
