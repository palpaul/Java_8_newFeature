package streamJava8;

import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
	//Q1 Given a list of integers, find out all the even numbers exist in the list using Stream functions?
		public static void main(String[] args) {
			
			List<Integer> numbers = List.of(2,13,11,10,8,40,31);
							numbers.stream().filter(e->e%2==0).forEach(System.out::print);
							//
							numbers.stream().filter(e->e%2==0).forEach(e->{System.out.println(e);});
							//or
							System.out.println("");
							List<Integer> numList = numbers.stream().filter(e->e%2==0).collect(Collectors.toList());
							System.out.println(numList);
							
							
		}	
}
