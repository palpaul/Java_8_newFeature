package streamJava8;

import java.util.Arrays;
import java.util.List;

public class QUestion1 {
public static void main(String[] args) {
	

	    List<Employee2>employees=Arrays.asList(
	                new Employee2("Emp1","CS",10000),
	                new Employee2("Emp2","CS",15000),
	                new Employee2("Emp3","IT",20000),
	                new Employee2("Emp4","IT",25000));

	  employees.stream().filter(i->i.getEmpBranch().)  
	    
	    //	Output:
//	    CS:Employee("Emp2","CS",15000),
//	    IT:Employee("Emp4","IT",25000)
}                                     
}
