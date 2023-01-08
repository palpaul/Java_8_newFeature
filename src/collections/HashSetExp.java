package collections;

import java.util.HashSet;

public class HashSetExp {
	public static void main(String[] args) {
		HashSet<Integer> hset = new HashSet<Integer>();
		hset.add(11); //duplicate not allowed
		hset.add(null); // one null value allowed only
		hset.add(null); //ele inserted assending order
		hset.add(11);
		hset.add(4);
		hset.add(5);
		hset.add(2);
		System.out.println(hset);
		
		
	}

}
