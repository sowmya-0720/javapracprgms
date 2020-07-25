package week2.day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintList3 {

	public static void main(String[] args) {
		

String str = "Bugatti Chiron";
System.out.println(str.length());
List<Character> ls=new ArrayList<Character>();
for(int i=0;i<str.length();i++)
{
	ls.add(str.charAt(i));
}
Iterator<Character> itr=ls.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}

}}