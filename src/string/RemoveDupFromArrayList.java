package string;
import java.util.ArrayList;
import java.util.List;

public class RemoveDupFromArrayList {
	
	public static void main(String args[]) {
	
		ArrayList<Integer> duparr = new ArrayList<Integer>();
		duparr.add(4);
		duparr.add(3);
		duparr.add(3);
		duparr.add(5);
		duparr.add(1);
		duparr.add(2);
		duparr.add(4);
		duparr.add(1);
		
		ArrayList<Integer> temp = new ArrayList<>();
		System.out.println("Before removing duplicates elements are: "+""+duparr);
 		for(Integer i : duparr) {	
 			if(temp.contains(i)) {
 				continue;
 			}
 				else {
 					temp.add(i);
 				}
 			}
 		System.out.println("After removing duplicates elements are: " +""+temp);
		
		
	}
		
		
	}

