//Tyler Vultaggio
//Lab 3
//2/18/2020
public class Problem4 
{

	public static void main(String[] args) 
	{
		boolean x = true;
		for(int n = 15000; n > 0; n--)
		{
				for(int i = 2; i <= n/2; i++)
				{
					if(n % i == 0)
					{
						x = false;
						break;
					}
				}
			if(x)
			{
				System.out.print(n);
				break;
			}
			x = true;
		}

	}

}
