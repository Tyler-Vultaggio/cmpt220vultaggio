//Tyler Vultaggio
//2/25/20
//Lab4

import java.util.Random;

public class Problem2 
{

	public static void main(String[] args) 
	{
		char matrix[][] = new char[5][5];
		Random random = new Random();
		for (int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				char letter = (char)(random.nextInt(26)+ 'a');
				matrix[i][j] = letter;
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.print("\n");
		}

	}

}
