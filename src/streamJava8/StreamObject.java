package streamJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

	
	public static void main(String[] args) {
		
		// How to create Stream objects
		// many method to create stream object.
		
		//1 -blank
		Stream<Object> emptyStream = Stream.empty();
		// it will print nothing because its a empty stream
		emptyStream.forEach(e->{System.out.println(e);});
		
		//2nd Objects,collection
		String names[]= {"Shivam","Durgesh","Uttam","Rahul"};
		//Stream of String objects
		Stream<String> stream1= Stream.of(names);
		stream1.forEach(e->{System.out.println(e);});
		System.out.println("");
		//3rd
		Stream<Object> streamBuilder = Stream.builder().build();
		
		//4th
		IntStream stream = Arrays.stream(new int[] {2,4,65,3,455}); 
		
		stream.forEach(e->{System.out.println(e);});
		System.out.println("");

		
		// 5th and imp
		// List , Set	
		List<Integer> slist = new ArrayList<>();
		slist.add(12);  
		slist.add(34);
		slist.add(23);
		slist.add(78);
		slist.forEach(e->{System.out.println(e);});
		
		Stream<Integer> stream2 = slist.stream();
		stream2.forEach(e->{System.out.println(e);});
		
		
	}
}
