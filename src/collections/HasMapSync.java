package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HasMapSync {
	public static void main(String[] args) {
		
		Map<String, String> hasmap1 = new HashMap<>();
		hasmap1.put("1", "Shivam");
		hasmap1.put("2", "Rahul");
		hasmap1.put("2", "Ashish");
		hasmap1.put("3", "Kumar"); //duplicate value allowed
		hasmap1.put(null, "AMit"); // only one null key allowed
		hasmap1.put("4", null);
		hasmap1.put("5", null);// multiple null value allowed
		System.out.println("Creating hashMap");
		System.out.println(hasmap1);
		System.out.println("COnverting Hashmap into SynchronizedMap using collections.synchronizedMap() method");
		
		//creating synchronizedMap we have to use Collections.synchronizedMap(map) method ok
		Map<String , String> syncMap = Collections.synchronizedMap(hasmap1); 
		// as we are converting hasmap into synchronized mAp only diffece is that its thread safe 
		//otherwise all this things same as hasmap
		
		//duplicate value allowed
		// only one null key allowed
		// multiple null value allowed
		
		System.out.println(syncMap);
		
		//creating COncurrentHashmap
		System.out.println("Creating concurrentHashMap");
		// it does not thorugh any concurrentmodification exception its fail-safe
		//locak applied onlt segment level not locking the whole obj ok
		ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
		concurrentHashMap.put("1", "Java");
		concurrentHashMap.put("2", "Java"); // duplicate value allowed
		concurrentHashMap.put("3", "Python");
		//
		//concurrentHashMap.put(null, "Java"); // null key not allowed it will thorgh null pointer exception
		//concurrentHashMap.put("4", null); // null vlaue also not allowe , null pointer exception it will through
	// thread safe synchronized
		System.out.println(concurrentHashMap);
		
		//creating hashTable
		System.out.println("Creating hashTable");
		Hashtable<String, String> hashTable = new Hashtable<>();
		hashTable.put("1", "Node");
		hashTable.put("2", "Node");// duplicate allowed
		hashTable.put("3", "React");
		//hashTable.put(null, "Node"); // null key and vlaue not allow
		//hashTable.put("4", null);
		//its accqure lock in whole obj
		// performace is also in multithread env that why used concurrecntHashMap in mutithread env 
		
		System.out.println(hashTable);
		
		
		
		
	}

}
