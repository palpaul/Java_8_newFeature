package streamJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListofString {
	public static void main(String[] args) {
		List<String > list = Arrays.asList("IbmIndia","Rahul","Shivam","Akshay","Priyanka","Hello");
		
	//list.stream().sorted((a, b) -> a.length() - b.length()).forEach(System.out::println);
	
//List<String>finalList =	list.stream().sorted((x,y)->x.length()-y.length()).collect(Collectors.toList());
//	System.out.println(finalList);
	
	//
	//<String>finalList1 = 
			Collections.sort(list, (a, b)->Integer.compare(a.length(), b.length()));
	System.out.println(list);
	
	
	}
}
