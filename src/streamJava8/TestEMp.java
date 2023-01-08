package streamJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestEMp {
	
	public static void main(String[] args) {	

		Employee Emp1 = new Employee("Emp1", 21, 10000);
		Employee Emp2 = new Employee("Emp2", 25, 8000);
		Employee Emp3 = new Employee("Emp3", 19, 450000);
		
		List<Employee> employees = new ArrayList<>();
						employees.add(Emp1);
						employees.add(Emp2);
						employees.add(Emp3);

	List<Employee> newEmployees = null;
		       newEmployees = employees.stream().filter(e->e.getName().equalsIgnoreCase("emp2")).collect(Collectors.toList());
		
	System.out.println(newEmployees.size());
	}

}
