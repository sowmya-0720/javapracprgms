package week1.day1;

import java.util.Arrays;

public class LearnComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int[] num1 = {1,2,5,32,87};
		//int[] num3 = {1,2,5,32,87};
		
		int[] num2 = {32,78,1,5,4};
		
		System.out.println(Arrays.equals(num1, num2));
		*/
		
	
			int inarr1[] = {1, 2, 3}; 
			int inarr2[] = {1, 2, 3}; 
			Object[] arr1 = {inarr1}; // arr1 contains only one element 
			Object[] arr2 = {inarr2}; // arr2 also contains only one element 
			Object[] outarr1 = {arr1}; // outarr1 contains only one element 
			Object[] outarr2 = {arr2}; // outarr2 also contains only one element		 
			if (Arrays.deepEquals(outarr1, outarr2)) 
				System.out.println("Same"); 
			else
				System.out.println("Not same"); 
			} 
		

		
		
		
	}


