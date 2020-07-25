package week1.day1;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array1 = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Transposed matrix is ---");
		for (int i=0; i < array1.length; i++)
		{
			for(int j=0;j < array1.length; j++)
			{
				System.out.println(array1[j][i]);
			}
			
		}
	}

}
