package string;

public class COnvert_Stingto_Integer {
	
	public static void main(String[] args) {
		//If you don't have numbers in string literal, 
		//calling Integer.parseInt() or Integer.valueOf() methods throw NumberFormatException.
		String str = "Rahul";

		try {
			//int num = Integer.valueOf(str);//converting string to int okk
			int num1 = Integer.parseInt(str);//converting string to int okk
			//System.out.println(num);
			System.out.println(num1);	
		} catch (Exception e) {
			// TODO: handle exceptio
			e.printStackTrace();
		}
			
		String str1 = "200";
		
		int num2 = Integer.parseInt(str1);
		System.out.println(str1+ 100);//200100, because "200"+100, here + is a string concatenation operator  
		System.out.println(num2+ 100);//300, because 200+100, here + is a binary plus operator  
		
		}//main method closed
		
	} 
