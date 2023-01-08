package string;

import java.util.HashMap;
import java.util.Map;

public class FIndOccuranceOfEachCharInString {
	public static void main(String[] args) {
		
		String str = "zoom";
		str= str.replaceAll("\\s", "");
		Map<Character, Integer> hmap= new HashMap<Character, Integer>();
		
		char[] chars = str.toCharArray();
		for(char ch: chars) {
			//System.out.println(ch); 
			if(!hmap.containsKey(ch)) {
				hmap.put(ch, 1);
			}else {
				hmap.put(ch,hmap.get(ch)+1);
				//int value = hmap.get(ch);
				//hmap.put(ch, value+1);
				
			}
		}// end of for loop
		System.out.println(hmap);
	}

}
