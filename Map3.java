package week2.day3;

import java.util.HashMap;
import java.util.Map;

public class Map3 {

	public static void main(String[] args) {
		Map<String,Integer> map3=new HashMap<String,Integer>();
		map3.put("A",1);
		map3.put("B",2);
		map3.put("C",3);
		map3.put("D",4);
		map3.put("E",5);
		map3.put("F",6);
		System.out.println(map3.entrySet());
		for(String each:map3.keySet())
		{
			System.out.println("key:"+each);
		}
		for(Integer each1:map3.values())
		{
			System.out.println("value:"+each1);
		}
	}

}
