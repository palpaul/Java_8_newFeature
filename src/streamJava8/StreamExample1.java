package streamJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
 * Stream are related to collection framework(Group of objects)
 * Stream API basically perform bulk operations on the objects 
 * its reduce the code length
 * */
public class StreamExample1 {
	public static void main(String[] args) {
		
		//Que) Create a list and filter the even number from the list.
		// 1st way to create a list uaing arrayList class and its a mutable okk.
		List<Integer> list1= new ArrayList<>();
		list1.add(2);
		list1.add(4);
		list1.add(50);
		list1.add(21);
		list1.add(20);
		list1.add(67);
		System.out.println(list1);
		//2nd way to create list using List.of() method
		//and this method wil createa immutable List cant add any other vlaue on this list ok after the instatiation.
			List<Integer> list2 = List.of(2,4,50,21,20,67);
			System.out.println(list2);
			
			
			
			//3rd way to create list this alos create a immutable List
		List<Integer> list3=Arrays.asList(2,4,50,21,20,67);
			System.out.println(list3);
			
			//now find out enven number of element from the list
			//so we need to create one another list where i can store all even list vlaue ok.
			List<Integer> evenList = new ArrayList<Integer>();
			for(Integer i:list1) {
				
				if(i % 2 ==0) {
					evenList.add(i);
				}
			}
			System.out.println("Even elements List is : " +evenList);
			
			//Now if we do same thing Using Stream api **************
			System.out.println("Even list Using Streams");
			
		 //here filter function will return the boolean value 
			//ie. also called predicate so here we will use lemda function for that ok)
			//if this function will return true then only it will filter out the elements okk
			//after that lemda function (predicate) we will use dot.collect function (it will collect the elements))
			//means filtered elements will collect using .collect method ok
			//using stream the same code reduce the code within one or 2 line only 
			//in 2 line of code
			Stream<Integer> streamss = list1.stream();
			List<Integer> newList = streamss.filter(i ->i % 2==0).collect(Collectors.toList());
			 System.out.println(newList);
			 
			 
			 //in single line of code
			//or we can write this power of stream reduce the code work with bulk objects to perform opr
			 List<Integer> newList2 = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
			 System.out.println(newList2);
			 
			 List<Integer> newList3 = list1.stream().filter(i->i>10).collect(Collectors.toList());
			 System.out.println("find out greator then 10 elements from the list : " +newList3);
			
	}

}
