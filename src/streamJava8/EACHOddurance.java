package streamJava8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EACHOddurance {
	public static void main(String[] args) {

List<String >listll = List.of("Rahul","Rahul","Shivam");	
	//	List<String > list = Arrays.asList("Rahul","Rahul","Shivam");

		Map<String, Long> finallist = listll.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(finallist);
	}

}
