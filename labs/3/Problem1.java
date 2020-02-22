import java.util.Scanner;

//Tyler Vultaggio
//Lab 3
//2/18/2020
public class Problem1 
{

	public static void main(String[] args) 
	{
		//User Input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer, the input ends with a 0:");
		int num = input.nextInt();
		
		//Variables
		int even = 0;
		int total = 0;
		double avg = 0;
		double count = 0;
		
		//Loop for calculations and more user input
		while (num != 0)
		{
			total = num + total;
			if ((num%2) == 0)
			{
				even++;
			}
			count++;
			num = input.nextInt();
		}
		//Calculations and Outputs
		avg = total/count;
		System.out.println("The number of even numbers: " + even);
		System.out.println("The total sum: " + total);
		System.out.printf("The average is: %5.2f",avg);

	}

}
