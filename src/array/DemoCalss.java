package array;

public class DemoCalss {
	//aray of ele is 3,1,5,6,4
	//op- 1,3,5,4,6
	public static void main(String[] args) {
		
		int arr[] = {3,1,5,6,4};
		int iniele=0;
		int lastele = 0;
		int i;
		for(i=0;i<arr.length;i++) {
			if(arr[i]<iniele) {
				iniele=arr[i];
				//System.out.println(iniele);
			}
			//System.out.println(iniele);
		}
		System.out.println(iniele);
		System.out.println(arr[i]);
		 if(arr[i]>lastele) {
			lastele=arr[i];
		}
		System.out.println(lastele);
		
	}

}
