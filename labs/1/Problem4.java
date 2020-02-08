import java.util.Scanner;

public class Problem4 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter a value for mass in kilograms: ");
		double mass = input.nextDouble();
		
		
		double speed = 299972458;
		double c = speed * speed;
		
		
		double E = mass*c;
		
		System.out.print("This is the answer: " + E);

	}

}
