package string;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FindOccuranceofeachChar {
		
		public static void main(String[] args) {
			
			String str1 = "XOOM Hello ";
		 String str = str1.replaceAll("\\s","");
			char[] charr=str.toCharArray();
			Map<Character, Integer> hmap = new HashMap<>();
			
			for(char chh:charr) {
				if(!hmap.containsKey(chh)) {
					hmap.put(chh, 1);
				}
				else {
					hmap.put(chh, hmap.get(chh)+1);
				}
			}
			System.out.println(hmap);
			
			Iterator<Character> itr = hmap.keySet().iterator();
			while (itr.hasNext()) {
				Character strTemp = itr.next();
				if(hmap.get(strTemp)==1) {
					System.out.println(strTemp+": " +hmap.get(strTemp));
				}
				
			}
	}


}
