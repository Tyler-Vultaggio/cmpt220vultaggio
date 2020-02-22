//Tyler Vultaggio
//Lab 3 
//2/18/2020
public class Problem7 
{

	public static void main(String[] args)
	{
		for (int i = 1; i < 51; i++) 
		{
			if(i % 10 == 0) 
			{
				System.out.println();
			}
			System.out.print(pentagonizer(i) + " ");
		}
	}
	
	public static int pentagonizer(int n) 
	{
		return ((n* n) * 3 - n) / 2;
	}

}
