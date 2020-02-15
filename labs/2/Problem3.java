import java.util.Scanner;

//Tyler Vultaggio
//CMPT 220
//2/11/20
public class Problem3 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your low interger: ");
		int low = input.nextInt();
		System.out.print("Enter your high interger: ");
		int high = input.nextInt();
		
		int range = high - low + 1;
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println((int)(Math.random() * range) + low);
		}

	}

}
