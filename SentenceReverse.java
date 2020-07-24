package week1.day1;

import java.util.Arrays;

public class SentenceReverse {

	/*Input: "When the world realise its own mistake, corona will dissolve automatically"
	output: "When eht world esilaer its nwo mistake, anoroc will evlossid automatically"
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "When the world realise its own mistake, corona will dissolve automatically";
		String[] splitInput = input.split(" ");
		
		//code to reverse
		for (int i=0; i < splitInput.length; i++)
		{
			if(i%2 != 0)
			{
				StringBuffer buffer = new StringBuffer(splitInput[i]);
				splitInput[i] = buffer.reverse().toString();
				System.out.println("Reverse string is " + splitInput[i] + " ");				
			}
							
		}
		//code to print the string
		System.out.println("Output string is \n");
		for (int i=0; i < splitInput.length; i++)
		{
			System.out.println(splitInput[i] +"\t");
		}
		

	}

}
