package streamJava8;

import java.util.Comparator;
import java.util.List;

public class ThirdHigherstSalaryfromObject {
	
	public static void main(String[] args) {
		List<Emp> empList = List.of( 
				new Emp(1,"Rahul",100),
				new Emp(2,"Shivam",200),
				new Emp(3,"Akshay",150),
				new Emp(5,"Ajay",250));
		System.out.println(empList);
		System.out.println("");
		System.out.println("assending order");
		empList.stream().sorted(Comparator.comparing(Emp::getEmpSal)).forEach(System.out::println);
		System.out.println("reversed order");
		empList.stream().sorted(Comparator.comparing(Emp::getEmpSal).reversed()).forEach(System.out::println);
		System.out.println("");
		System.out.println("3rd Highest salary expected is 150 right");
		empList.stream().sorted(Comparator.comparing(Emp::getEmpSal).reversed()).skip(2).limit(1).forEach(System.out::println);
//practice
		empList.stream().sorted(Comparator.comparing(Emp::getEmpSal).reversed()).skip(1).limit(2).forEach(System.out::print);
	
	}

}
