//Tyler Vultaggio
//2/25/20
//Lab4

public class Problem1
{

	public static void main(String[] args) 
	{
		double cm = 2.54;
		double in = 1/2.54;
		System.out.printf("%s %10s | %s %10s %n", "in", "cm", "cm", "in");
		System.out.println("------------------------------");
		int count = 1;
		
		for(int i = 1; i < 51; i++)
		{
			System.out.printf("%2d %10.2f | %3d %9.2f %n", i, (cm * i), count, (in * count));
			count+=5;
		}
	}

}
