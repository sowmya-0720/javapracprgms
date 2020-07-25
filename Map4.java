package week2.day3;

import java.util.HashMap;
import java.util.Map;

public class Map4 {

	public static void main(String[] args) {
		Map<String,Integer> map4=new HashMap<String,Integer>();
		map4.put("A",1);
		map4.put("B",2);
		map4.put("C",3);
		map4.put("D",4);
		map4.put("E",5);
		map4.put("F",6);
		System.out.println(map4.entrySet());
		//map4.forEach((k,v)->System.out.println("key:"+k+","+"value:"+v));
//lambda expression
	}

}
