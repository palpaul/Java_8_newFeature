package streamJava8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindFirst {
	public static void main(String[] args) {
		
		List<Integer> myList= Arrays.asList(10,15,8,49,25,98,98,32,15);
			
		myList.stream().findFirst().ifPresent(System.out::println);
		//or
		// find total no of element present in the list
		
		long count= myList.stream().count();
		System.out.println("total elemennts in the lst : " +count);
	}
}
