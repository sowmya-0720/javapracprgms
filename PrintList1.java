package week2.day1;

import java.util.ArrayList;
import java.util.List;

public class PrintList1 {

	public static void main(String[] args) {
		
		String str = "Bugatti Chiron";
		System.out.println(str.length());
		List<Character> ls=new ArrayList<Character>();
		for(int i=0;i<str.length();i++)
		{
			ls.add(str.charAt(i));
		}
		System.out.println(ls);
		for(int j=0;j<ls.size();j++)
		{
			System.out.println(ls.get(j));
		}
	}

}
