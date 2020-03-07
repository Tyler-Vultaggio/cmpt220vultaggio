//Tyler Vultaggio
//3/3/2020
//Lab5

import java.util.Arrays;
import java.util.Scanner;

public class Problem4 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the first array: ");
		Scanner scan = new Scanner(System.in);
		int size1 = scan.nextInt();
		int array1[] = new int[size1];
		for (int i = 0; i < size1; i++)
		{
			int num1 = scan.nextInt();
			array1[i] = num1;
		}
		System.out.println("Enter the second array: ");
		int size2 = scan.nextInt();
		int array2[] = new int[size2];
		for (int j = 0; j < size2; j++)
		{
			int num2 = scan.nextInt();
			array2[j] = num2;
		}
		
		boolean TF = equal(array1, array2);
		
		if (TF == false)
			System.out.println("The two arrays are not identical");
		else
			System.out.println("The two arrays are identical");
	}
	
	public static boolean equal(int[] x, int[] y)
	{
		int A = x.length;
		int B = y.length;
		
		if (A != B)
			return false;
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		for (int i = 0; i < A; i++)
		{
			if (x[i] != y[i])
				return false;
		}
		return true;
	}
	
	
	
}