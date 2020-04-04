//Tyler Vultaggio
//3/3/2020
//Lab5

import java.util.Scanner;

public class Problem2 
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
		double theMean = mean(array);
		double StandardDeviation = deviation(array);
		
		System.out.println("The Mean is: " + theMean);
		System.out.println("The Standard Deviation is: " + StandardDeviation);
	}

	public static double mean(double[] x)
	{
		double sum = 0;
		double num;
		for(int i = 0; i < x.length; i++)
		{
			num = x[i];
			sum += num;
		}
		double ans1 = sum/x.length;
		return ans1;
	}
	
	public static double deviation(double [] x)
	{ 
		double sum = 0;
		double num;
		double newNum = 0;
		for (int i = 0; i < x.length; i++)
		{
			num = x[i];
			sum += sum;
		}
		double mean = sum/x.length; // JA: You should call the mean method
		
		for (int j = 0; j < x.length; j++)
		{
			newNum += ((x[j] - mean)*(x[j] - mean))/(x.length - 1); // JA
		}
		newNum = Math.sqrt(newNum);
		return newNum;
	}
	
	
	

}
