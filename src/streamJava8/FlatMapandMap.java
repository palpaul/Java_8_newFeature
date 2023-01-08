package streamJava8;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class FlatMapandMap {
	public static void main(String[] args) {
		// Java program using flatMap() function
	
		        // making the ArrayList object of List of Integer
		List<List<Integer> >number = new ArrayList<>();       
		        // adding the elements to number arrayList
		        			number.add(Arrays.asList(1, 2,9));
		        			number.add(Arrays.asList(3, 4));
		        			number.add(Arrays.asList(5, 6));
		        			number.add(Arrays.asList(7, 8));
		        
		List<Integer> number1 = List.of(1,2,4);
		        	        
		        System.out.println("List of list-" + number);
        
		        List<Integer>newList = number1.stream().map(i->i*2).collect(Collectors.toList());
		        System.out.println("transform  list by Map: " +newList);
	// using flatMap() to flatten this list
	List<Integer> flatList= number.stream().flatMap(list -> list.stream()).collect(Collectors.toList());    
		        // printing the list
		        System.out.println("List generate by flatMap-" + flatList);
	}

}
