package string;

public class RemoveDupEleSortedArray {
	public static void main(String[] args) {
	
	int [] arr= {1,2,2,3,3,3,4,5,5,5,5};
	
	//int [] tempArr  = new int [arr.length];
	int j=0;
//	for(int i =0;i<arr.length-1;i++) {
//		
//		if(arr[i]!=arr[i+1]) {
//			tempArr[j]= arr[i];
//			j++;
//		}
//		
//	}
//	tempArr[j]=arr[arr.length-1];
//	//this iloop is to print the elemenet which has no  duplicacy
//		for(int i = 0; i<tempArr.length; i++) {
//			System.out.print(tempArr[i]+" ");
//			
//		}
		
		//metohd -2 without temp arrry
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j]=arr[i];
				j++;
			}
		}
		arr[j]=arr[arr.length-1];
		for(int i=0;i<j+1;i++) {
			System.out.print(arr[i]+ " ");
		}
		
	
}
}
