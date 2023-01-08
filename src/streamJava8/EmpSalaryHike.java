package streamJava8;

import java.util.List;
import java.util.stream.Collectors;

public class EmpSalaryHike {
	
	public static void main(String[] args) {
		List<Emp> empList = List.of( 
				new Emp(1,"Rahul",100),
				new Emp(2,"Shivam",200),
				new Emp(3,"Akshay",150));
			empList.stream().filter(s->s.getEmpSal()>100).collect(Collectors.toList()).forEach(System.out::println);
					//System.out.println(newempList);
		
	}

}
