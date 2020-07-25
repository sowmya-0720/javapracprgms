package week2.day3;

import java.util.HashMap;
import java.util.Map;

public class map_3 {

	public static void main(String[] args) {
		Map<String,Integer> map2=new HashMap<String,Integer>();
		map2.put("A",1);
		map2.put("B",2);
		map2.put("C",3);
		map2.put("D",4);
		map2.put("E",5);
		map2.put("F",6);
		System.out.println(map2.entrySet());
		for(String name:map2.keySet())
		{
			Integer value=map2.get(name);
			System.out.println(name+"->"+value);
		}
	}

}
