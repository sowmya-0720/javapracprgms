package week2.day5;

public class Stringdoubt {

	public static void main(String[] args) {
		String str1 = "SELENIUM";
		String str2 = "selenium";
		String str3 = "SELENIUM";
		String str4 = "zseleniu";  
		//String Comparison using Relational (==) Operator 
		System.out.println(str1 == str2);//false
		System.out.println(str1 == str3);//true  
		//String Comparison using equals() Method
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));//true  
		//String comparison using compareTo() 
		System.out.println(str1.compareTo(str2));//Negative value 
		System.out.println(str1.compareTo(str3));//0 
		System.out.println(str4.compareTo(str1));//Positive value
	}

}
