package string;

public class Palindrome {
	
	public static void checkPalindrome() {
		
		int num = 121;
		int rev=0,reminder;
		int temp = num;
		
		while (num>0) {
			//reverse the num----
			//find the reminder
			//multiply the var reverse by 10
			//divide the num by 10;
			reminder = num%10;
			rev= rev*10+reminder;
			num= num/10;
		}
			if(temp ==rev) {
				System.out.println("Palindrome number");
			}
			else {
				System.out.println("Not palindorem number");
			}
		}
	
	public static void main(String[] args) {
	checkPalindrome();
	}

}
