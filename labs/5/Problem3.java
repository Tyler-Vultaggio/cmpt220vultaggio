//Tyler Vultaggio
//3/3/2020
//Lab5

import java.util.Scanner;

public class Problem3 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number of students: ");
		Scanner input = new Scanner(System.in);
		int studs = input.nextInt();
		String[] students = new String[studs];
		int [] scores = new int[students.length];
		
		System.out.println("Enter the name and a score for every student: ");
		for (int i = 0; i < students.length; i++)
		{
			System.out.print("Student " + (i + 1) + ": ");
			students[i] = input.next();
			
			System.out.print("Score: ");
			scores[i] = input.nextInt();
		}
		String newArray[] = new String[students.length];
		newArray = sortIncreasing(students, scores);
		for (int k = 0; k < newArray.length; k++)
		{
			System.out.println(newArray[k]);
		}
	}
	
	public static String[] sortIncreasing(String[] x, int[] y) 
	{
		
		for (int i = 0; i < x.length; i++) 
		{
			int min = y[i];
			int minIndex = i;
			String fix;

			for (int j = i + 1; j < y.length; j++)
			{
				if (y[j] < min)
				{
					min = y[j];
					minIndex = j;			
				}
			}
			if (minIndex != i) 
			{
				fix = x[i];
				x[i] = x[minIndex];
				x[minIndex] = fix;

				y[minIndex] = y[i];
				y[i] = min;
			}
		}
		return x;
	}
	
	
}