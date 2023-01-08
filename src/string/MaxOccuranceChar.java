package string;

public class MaxOccuranceChar {
	public static void main(String[] args) {
		String str = "helllo abbccc helllo";
		str = str.replaceAll("\\s","");
		
		int [] arr = new int[127]; 
		
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)]=arr[str.charAt(i)]+1;
		}
		int max= -1;
		char ch = ' ';
		for(int i = 0;i<str.length();i++) {
			if(max<arr[str.charAt(i)]) {
				max= arr[str.charAt(i)];
				ch =str.charAt(i);		
			}
		}
		System.out.println("Maximum repeated character is : " +ch );
		
		
	}

}
