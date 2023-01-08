package string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class FIndOccuranceWords {

	public static void main(String[] args) {
		String str = "I am Java developer because I like Java";
		String[] words = str.split(" ");
		//str= str.replaceAll("\\s", "");
		Map<String, Integer> hsmap = new HashMap<String, Integer>();
		for(String w:words) {
			//System.out.print(w);
			
			if(hsmap.get(w)== null)
				hsmap.put(w, 1);
			else
				hsmap.put(w, hsmap.get(w)+1);
		}
		System.out.println(hsmap);
		//Iterator<String> itr = hsmap.keySet().iterator();
		Iterator<Entry<String,Integer>> it2 = hsmap.entrySet().iterator();
//		while(itr.hasNext()) {
//			String strtemp = itr.next();
//			if(hsmap.get(strtemp) > 1) {
//				//System.out.println(strtemp+ " : " +hsmap.get(strtemp));
//			}
//			
//		
//		}
		
		while(it2.hasNext()) {
			Entry entry = it2.next();
		if((Integer)entry.getValue()>1) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		}
		
	}
}
