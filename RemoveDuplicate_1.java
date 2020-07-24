package week1.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate_1 {
	
	/*
	 * 1. How to remove duplicates from a list? 
		List = "A,B,C,D,A,D,E,F"
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stubRemoveDuplicate_1.java
		
		String [] str = {"A", "B", "C", "D", "A", "D", "E", "F"};
		List<String> charLst = new ArrayList<String>(Arrays.asList(str));
		List<String> uniqueLst = new ArrayList<String>();
		
		for (String each : charLst ) {
			if (!uniqueLst.contains(each)) {
				uniqueLst.add(each);

			} 
		}
		
		for (String uniq : uniqueLst) {
			System.out.println(uniq);
		}
		
		
		

	}

}
