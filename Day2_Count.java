package week1.day1;

public class Day2_Count {
	
	
	/*Write a java program to find the number of Uppercase, 
	 * lowercase,
	 *  numbers and spaces 
	 *  in the following String.
	Input: "1. It is Work from Home  not Work for Home"*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "1. It is Work from Home  not Work for Home";
		String lower = input.replaceAll("[^a-z]", "").trim();
		
		System.out.println("\n\n No. of lower case letters is" + lower.length());
		String upperCase = input.replaceAll("[^A-Z]", "").trim();
		System.out.println("\n No. of Upper case letters is" + upperCase.length());
		
		String numbers = input.replaceAll("[^0-9]", "").trim();
		System.out.println("\n\n Numbers in the string is" + numbers.length());
		
		String spaces = input.replaceAll("[^\\S]", "");
		System.out.println("\n\n Number of white spaces" + spaces.length());

	}

}
