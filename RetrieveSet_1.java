package week1.day1;

import java.util.HashSet;
import java.util.Set;

/*
 * 2. How to retrieve a value from a Set?
Set = "1,2,3,4,5,6,7,8,9"
retrieve and print only the value - 7
 * 
 */

public class RetrieveSet_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> sample =  new HashSet<Integer>();
		sample.add(1);
		sample.add(2);
		sample.add(3);
		sample.add(4);
		sample.add(5);
		sample.add(6);
		sample.add(7);
		sample.add(8);
		sample.add(9);
		if (sample.contains(7))
		{
			System.out.println("Set contains 7");
			
		}
		
		
		

	}

}
