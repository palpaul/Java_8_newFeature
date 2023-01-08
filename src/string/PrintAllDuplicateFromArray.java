package string;

public class PrintAllDuplicateFromArray {

	
	/* algo to used
	  Declare and initialize an array.
	  Duplicate elements can be found using two loops. The outer loop will iterate through the array from 0 to length of the array. 
	  The outer loop will select an element. The inner loop will be used to compare the selected element with the rest of the elements of the array.
	  If a match is found which means the duplicate element is found then, display the element.
	 */
	
	public static void main(String[] args) {
		
	//Initialize array
		//or 
		//int [] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
	int [] arr = new int[] {11, 2, 11,3, 4, 2, 7, 8,7,8};
	
	for(int i=0;i < arr.length;i++) {
		
		for(int j=i+1;j < arr.length;j++) {
			
			if(arr[i] == arr[j]	) {
				System.out.print(arr[j]+" ");
			}
		}
	}
	}
}
