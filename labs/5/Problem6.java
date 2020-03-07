//Tyler Vultaggio
//3/3/2020
//Lab5

import java.util.Scanner;

public class Problem6 
{
	public static void main(String[] args) 
	{
		double[][] Array1 = {{1, 2}, {1, 2, 3, 4 , 5}};
		double avg = averageRow(Array1, 1);
		System.out.println(avg);
	}
	
	public static double averageRow(double[][] array, int row) 
	{
		double total = 0;
		int counter = 0;
		for(int j = 0; j < array[row].length; j++) 
		{
			   total += array[row][j];
			   counter++;
		}
		return total/counter;
	}
}

