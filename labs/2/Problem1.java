import java.util.Scanner;

//Tyler Vultaggio
//CMPT 220
//2/11/20
public class Problem1 
{

	public static void main(String[] args)
	{
		//Creates the scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number for number 1: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter a number for number 2: ");
		int number2 = input.nextInt();
		
		System.out.println(number1 + " is LESS THAN " + number2 + "? " + (number1 < number2));
		System.out.println(number1 + " is LESS THAN or EQUAL TOO " + number2 + "? " + (number1 <= number2));
		System.out.println(number1 + " is EQUAL TOO " + number2 + "? " + (number1 == number2));
		System.out.println(number1 + " is NOT EQUAL TOO " + number2 + "? " + (number1 != number2));
		System.out.println(number1 + " is GREATER THAN " + number2 + "? " + (number1 > number2));
		System.out.println(number1 + " is GREATER THAN or EQUAL TOO " + number2 + "? " + (number1 >= number2));
	}

}
