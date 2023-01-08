package streamJava8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {

	public static void main(String[] args) {
		//Q3 How to find duplicate elements in a given integers list in java using Stream functions?
		
		List<Integer> myList= Arrays.asList(10,15,8,49,25,98,98,32,15);
		//create hashSet class
		Set<Integer> set = new HashSet<>();
		myList.stream().filter(n->!set.add(n)).forEach(System.out::println);
		//or
		System.out.println("");
		//myList.stream().filter(n->!set.add(n)).forEach(n->{System.out.println(n);});
									
		
		//print in another way
//		List<Integer> newList = myList.stream().filter(n->!set.add(n)).collect(Collectors.toList());
//		System.out.println(newList);
//		
		
	}
}
