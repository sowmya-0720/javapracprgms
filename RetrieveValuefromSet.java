package week2.day2;

import java.util.HashSet;
import java.util.Set;

public class RetrieveValuefromSet {

	public static void main(String[] args) {
		Set<Integer> ls=new HashSet<Integer>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.add(6);
		ls.add(7);
		ls.add(8);
		System.out.println(ls);
		if(ls.contains(7))
		{
			System.out.println("it contains 7");
		}
		
		

	}

}
