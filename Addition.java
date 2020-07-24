package week1.day1;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "asdf1qwer9as8d7";
		str = str.replaceAll("[A-Za-z]", "");
		System.out.println(str);
		int number =  Integer.parseInt(str); 
		short sum = 0;
		while (number != 0)
		{
			sum += number%10;
			number= number/10;
			
		}
		System.out.println("Sum is" + sum);
	}

}
