package string;

public class Fabonacci {
	public static void main(String[] args) {
		
		int n = 10, firstTerm=0, secTerm =1;
		System.out.println("Fabonacci series till "+n+ " terms");
		//using for loop
//		for(int i=0;i<=n;i++) {
//			System.out.print(firstTerm + ",");
//			
//			//compute the next term
//			int nextTerm = firstTerm + secTerm;
//			firstTerm = secTerm;
//			secTerm = nextTerm;
//		}
		//using while loop
		int i=1;
		while(i<=n) {
			System.out.print(firstTerm + ",");
			int nextTerm = firstTerm+secTerm;
			firstTerm = secTerm;
			secTerm= nextTerm;
			i++;
		}
	}

}
