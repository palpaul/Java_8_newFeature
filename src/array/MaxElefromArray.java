package array;

public class MaxElefromArray {
	// Method to find maximum in arr[]
    static int largest() {
    	int arr[] = {2,3,1,5,21,11,15};
    	// initializing max element
    	int max = arr[0];
    	for(int i=1;i<=arr.length-1;i++) {
    		if(arr[i]>max) {
    			max=arr[i];
    			
    		}
    
    }
		return max;
  }
	
public static void main(String[] args) {
		System.out.println(MaxElefromArray.largest());
	}

}
