package string;
public class RevString {
	public static void main(String[] args) {
		
	String str = "Welcome";
	//method 1 toCharArray()
	char[] chrArr = str.toCharArray();
	for(int i = chrArr.length-1; i >= 0; i--) {
		System.out.print(chrArr[i]);
	}
	System.out.println("");
	System.out.println("*************");
	//method -2
	for(int i = str.length()-1; i >= 0; i--) {
		System.out.print(str.charAt(i));
	}
	
	//method -3(best approach)
	System.out.println("***********");
	String rev="";
	for(int i =str.length()-1;i>=0;i--) {
		rev=rev+str.charAt(i);
	}
	System.out.println("reverse of "+str+ " is : " +rev);
	
	//method -4
	System.out.println("");
	StringBuffer sbfr = new StringBuffer(str);
				sbfr.reverse();
				System.out.println("rev string useng reverse() inbuilt method of strigbuffer class: "+sbfr);

	//mehod -5
				System.out.println("");
				StringBuilder sbild = new StringBuilder(str);
							sbild.reverse();
							System.out.println("rev string useng reverse() inbuilt method of strigbuilder class: "+sbild);

	}
}
