package week1.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDplicateChars_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Character> set = new LinkedHashSet<Character>();
		String str = "When life gives you lemons, make lemonade";
		for (int i = 0; i < str.length(); i++) {
			if(!set.add(str.charAt(i))) {
				System.out.print(str.charAt(i)+",");
			}
		}
		
		System.out.println(set.size());
		for(Character each : set)
		{
			System.out.println(each);
		}
		

	}

}
