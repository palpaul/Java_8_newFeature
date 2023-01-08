package competative;

public class FindMaxelefromArray {
	 public static int findMax() {
		 int arr[]= {1,5,6,3,2};
		 int max = 0;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]>max) {
				 max=arr[i];
			 }
		 }
		 return max;
		 
	 }
public static void main(String[] args) {
	System.out.println("Max ele of array is :  " +findMax());
}
}
