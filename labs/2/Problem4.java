import java.util.Scanner;

//Tyler Vultaggio
//CMPT 220
//2/11/20
public class Problem4 
{

	public static void main(String[] args) 
	{
		//User Input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first charater: ");
		char first = input.next().charAt(0);
		System.out.print("Enter second charater: ");
		char second = input.next().charAt(0);
		
		//Output
		System.out.println(first + second);
		

	}

}
