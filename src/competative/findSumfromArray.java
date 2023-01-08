package competative;

public class findSumfromArray {	
	private static int findSum() {
		int arr[] = {1,6,5,2,3};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		return sum;
	}
public static void main(String[] args) {
	System.out.println("sum of the array = "+findSum());
}
}
