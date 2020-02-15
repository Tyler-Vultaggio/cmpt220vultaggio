import java.util.Scanner;

//Tyler Vultaggio
//CMPT 220
//2/11/20
public class Problem2 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of a month: ");
		int month = input.nextInt();
		
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		System.out.println("This is the month you entered: " + months[month - 1]);

	}

}
