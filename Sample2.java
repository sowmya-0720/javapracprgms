package week2.day4;

import java.util.HashMap;
import java.util.Map;

public class Sample2 {

	public static void main(String[] args) {
		String inputString="Karma is greater than God";
		 Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		  
	        //Converting given string to char array
	  
	        char[] strArray = inputString.toCharArray();
	  
	        //checking each char of strArray
	  
	        for (char c : strArray)
	        {
	            if(charCountMap.containsKey(c))
	            {
	                //If char 'c' is present in charCountMap, incrementing it's count by 1
	  
	                charCountMap.put(c, charCountMap.get(c)+1);
	            }
	            else
	            {
	                //If char 'c' is not present in charCountMap,
	                //putting 'c' into charCountMap with 1 as it's value
	  
	                charCountMap.put(c, 1);

	}

}
	    
//Printing inputString and charCountMap 

System.out.println(inputString+" : "+charCountMap);
}


	}


