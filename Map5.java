package week2.day3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Map5 {

	public static void main(String[] args) {
		Map<String,Integer> map2=new HashMap<String,Integer>();
		map2.put("A",1);
		map2.put("B",2);
		map2.put("C",3);
		map2.put("D",4);
		map2.put("E",5);
		map2.put("F",6);
		System.out.println(map2.entrySet());
		Iterator<Map.Entry<String,Integer>> itr=map2.entrySet().iterator();
		//itr.forEachRemaining((each)->System.out.println("key:"+each.getKey()+","
		//+"value:"+each.getValue()));

	}

}
