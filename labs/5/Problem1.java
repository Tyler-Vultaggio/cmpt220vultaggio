//Tyler Vultaggio
//3/6/2020
//Lab5


import java.util.*;

public class Problem1 
{
	
	public static void main(String[] args) 
	{
		double [] array = new double[10];
		int i = 0;
		
		System.out.println("Enter 10 numbers: ");
		for (i = 0; i < 10; i++)
		{
			Scanner scan = new Scanner(System.in);
			double num = scan.nextDouble();
			array[i] = num;
		}
		double maximum = max(array);
		
		System.out.println("The maximum number that was entered is: "+ maximum);
		
	}

	public static double max(double array[])
	{
		double max = 0.0;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] > max)
			{
				max = array[i];
			}
		}
		return max;
	}
}
