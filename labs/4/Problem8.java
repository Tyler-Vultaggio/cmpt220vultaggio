//Tyler Vultaggio
//2/25/2020
//Lab 4

import java.util.Arrays;
import java.util.Scanner;

public class Problem8 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		int[] arr = new int[100];
		System.out.print("Enter a number and to stop entering number enter 0: ");
		int x = input.nextInt();
		arr[0] = x;
		int count = 0;
		
		for(int i = 1; i < arr.length; i++)
		{
			System.out.print("Enter a number and to stop entering number enter 0: ");
			x = input.nextInt();
			arr[i] = x;
			count++;
			if(x == 0)
			{
				break;
			}
		}
		
		int[] finalarr = new int[count];
		
		for (int j = 0; j < count; j++)
		{
			finalarr[j] = arr[j];
		}
		
		Arrays.sort(finalarr);
		System.out.printf("%s", Arrays.toString(finalarr));

	}

}
