package week2.day4;

import java.util.HashMap;
import java.util.Map;

public class Countofchar_map2 {

	public static void main(String[] args) {
		String str = "Karma is powerful than God";
		char[] ch=str.toCharArray();
		int count=0;
		 Map<Character, Integer> hMap = new HashMap<Character, Integer>();
		 for(char each:ch)
		 {
			 if(!hMap.containsKey(each))
			 {
				 hMap.put(each, 1);
				 
			 }
			 else
			 {
				 count = hMap.get(each);
				  hMap.put(each, ++count); 
			 }
		 }
System.out.println(hMap);
	}

}
