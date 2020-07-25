package week2.day1;

import java.util.ArrayList;
import java.util.List;

public class PrintList2 {
public static void main(String[] args) {
		
	String str = "Bugatti Chiron";
	
	List<Character> ls=new ArrayList<Character>();
	for(int i=0;i<str.length();i++)
	{
		ls.add(str.charAt(i));
	}
	System.out.println(ls);
	for(Character each:ls)
		System.out.println(each);
	
	}

}
