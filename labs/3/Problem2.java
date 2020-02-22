//Tyler Vultaggio
//Lab 3
//2/18/2020
public class Problem2 
{

	public static void main(String[] args) 
	{
		int counter = 0;
		for(int i = 100; i <= 501; i++)
		{
				if(((i % 5) == 0) && ((i % 7) == 0))
				{
					
				}
				else if(i % 5 == 0)
				{
					System.out.print(i + " ");
					counter++;
				}
				else if(i % 7 ==0)
				{
					System.out.print(i + " ");
					counter++;
				}
				if(counter == 10)
				{
					System.out.println();
					counter = 0;
				}
				
			}
				
		}

	}
