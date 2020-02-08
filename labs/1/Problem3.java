import java.util.Scanner;

public class Problem3 
{

	public static void main(String[] args) 
	{
		//Scanner
		Scanner input = new Scanner(System.in);
		
		//User input
		System.out.print("Enter a value for ounces: ");
		
		//User variable
		double ounces = input.nextDouble();
		
		//Conversion of ounces into grams
		double grams = 28.3495 * ounces;
		
		//Answer to problem 3
		System.out.print("This is the answer in grams: " + grams);

	}

}
