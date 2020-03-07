//Tyler Vultaggio
//3/3/2020
//Lab5

import java.util.Scanner;

public class Problem5 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the matrix (2 = 2x2 matrix): ");
		int size = scan.nextInt();
		int matrix1[][] = new int [size][size];
		
		System.out.println("Enter the numbers for the matrix: ");
		for (int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
				matrix1[i][j] = scan.nextInt();
		}
		
		for (int i = 0; i < size; i++) 
		{ 
            for (int j = 0; j < size; j++) 
            	System.out.print(matrix1[i][j] + "  ");
            System.out.println();
		}
		
		int TransposedFinal[][] = TransposeMatrix(matrix1, size);
		System.out.println("\n--------\n");
		
		for (int i = 0; i < size; i++) 
		{ 
            for (int j = 0; j < size; j++) 
            	System.out.print(TransposedFinal[i][j] + " ");
            System.out.println();
		}
	}
	
	public static int[][] TransposeMatrix(int[][]x, int size)
	{
		int transposed[][]=new int[size][size];
		for(int i=0;i<3;i++)
		{    
			for(int j=0;j<3;j++)
				transposed[i][j]= x[j][i];   
		}    
		return transposed;
	}
	
	
}
