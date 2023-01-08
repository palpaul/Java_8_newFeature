package string;

public class AlternativePrimeNum {
	public static void main(String[] args) {
		int num = 20;
		System.out.println("Alternate prme no are :" +num);
		alternatePrimeNum(num);
		
	}
	//method to check prime number
	static int checkPrime(int num) {
		int flag=0;
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0)
			return 1;
		else
			return 0;		
		
	}
	
	static void alternatePrimeNum(int nnn) {
		//if the value of temp variable is odd, we do not print the prime number  
		//if the value of temp variable is even, we print the prime number  
		int temp = 2;
		for(int num =2;num<=nnn-1;num++) {
			if(checkPrime(num)==1) {
				//prints the prime number if temp is even  
				if(temp%2==0) {
					System.out.println(num + " ");
					temp++;
				}
			}
		}
	}
