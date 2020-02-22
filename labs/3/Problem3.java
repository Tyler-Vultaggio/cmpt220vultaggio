//Tyler Vultaggio
//Lab 3
//2/18/2020
public class Problem3 
{

	public static void main(String[] args)
	{
		int counter = 0;
		for(int i = 0; i <= 100; i++)
		{
			char a = (char) i;
			System.out.print(a + " ");
			counter++;
			if(counter == 20)
			{
				System.out.println();
				counter = 0;
			}
		}

	}

}
