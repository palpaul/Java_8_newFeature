package streamJava8;

import java.util.List;
import java.util.stream.Collectors;

public class startWith {
	//Q2 Given a list of integers, find out all the numbers starting with 1 using Stream functions?

	public static void main(String[] args) {
		
		List<Integer> numm= List.of(11,23,45,13,22,191);
		//converting integer to string using Stirng.Vlaueof or s->s+""
		numm.stream().map(s->String.valueOf(s)).filter(s->s.startsWith("1")).forEach(System.out::println);
		// another way to print
		System.out.println("");
		numm.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(s->{System.out.println(s);});
		// another way to print
		System.out.println("");
		List<String> newList = numm.stream().map(s->s+"").filter(s->s.startsWith("1")).collect(Collectors.toList());
		System.out.println(newList);
		
	}

}
