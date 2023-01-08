package streamJava8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueValue {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(11,12,22,12,12,1,13,1,13);
		HashSet<Integer> hs = new HashSet<>();
	//	list.stream().filter(i->hs.add(i)).forEach(System.out::println);;
		//or
		//list.stream().filter(i->hs.add(i)).forEach(n->{System.out.println(n);});

		List<Integer> newList = list.stream().filter(i->hs.add(i)).collect(Collectors.toList());
		System.out.println("Unique element list:- " +newList);
		
	}
	

}
