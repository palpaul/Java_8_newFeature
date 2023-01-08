package streamJava8;

import java.util.List;
import java.util.stream.Collectors;

import javax.xml.stream.events.Namespace;

public class StreamMethods {
	
	public static void main(String[] args) {
		//filter(predicate -- boolean valued function return true and false)
		//e->e>10
		
		// map ---> in each elements can perform any operations
		//map(funcation)
		List<String> names = List.of("Aman","Ankit","Shivam","Rahul");
		
		//find out the name who starts with a hehe filter will use to check the condition true or false base on A
	List<String> newNames=names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
	System.out.println("Elements which start with A :" +newNames);
	
	//find out the elements who's length is 5
		//List<String> names = List.of("Aman","Ankit","Shivam","Rahul");
			//List<String >nameswithLength5= newNames
	
			List<String>nameswithLength5 = names.stream().filter(e->e.length()==5).collect(Collectors.toList());
			System.out.println("Elements whos length is 5"+nameswithLength5);

				//	Find out the squre of the elements ,here map will use 
				//because no need to check true flase condition and here we just need to return number itself which we wnat the seqare
			
			List<Integer> numList = List.of(23,4,2,5,7,4);
			List<Integer> newNumList = numList.stream().map(i->i*i).collect(Collectors.toList());
			System.out.println(newNumList);
			
			//find the numbers which start wihih 2
			
		//pa	List<Integer> numstartwith2 = numList.stream().
			// find out the average of the elements in the list
			//List<Integer> numAvg = numList.stream().map(i->)
	}
	
	
}
