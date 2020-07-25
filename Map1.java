package week2.day3;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		Map<String,Integer> map1=new HashMap<String,Integer>();
		map1.put("A",1);
		map1.put("B",2);
		map1.put("C",3);
		map1.put("D",4);
		map1.put("E",5);
		map1.put("F",6);
		System.out.println(map1.entrySet());
		for(Map.Entry<String,Integer> each:map1.entrySet())
		{
			System.out.println(each);
			System.out.println(each.getKey()+"->"+each.getValue());
		}
		
		

	}

}
