package streamJava8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThirrdHighestSalaryforList {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(100,200,300,400,500);
		System.out.println("Sorted order");
		list.stream().sorted().forEach(System.out::println);
		System.out.println("Desending order");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("3rd highest salary");
	list.stream().sorted(Comparator.reverseOrder()).skip(2).limit(1).forEach(System.out::println);
		
	}

}
