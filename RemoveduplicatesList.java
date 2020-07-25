package week2.day2;

import java.util.ArrayList;
import java.util.List;

public class RemoveduplicatesList {

	public static void main(String[] args) {
		List<Character> ls=new ArrayList<Character>();
		ls.add('A');
		ls.add('B');
		ls.add('C');
		ls.add('D');
		ls.add('A');
		ls.add('D');
		ls.add('E');
		ls.add('F');
		System.out.println(ls);
		List<Character> ls1=new ArrayList<Character>();
			
		
		  for(Character each:ls)
		  { 
			  if(!ls1.contains(each))
			  {
				  ls1.add(each);
			  }
					  }
		  System.out.println(ls1);
		 

	}

}
