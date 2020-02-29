//Tyler Vultaggio
//2/25/2020
//Lab4

import java.util.Scanner;

public class Problem4 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String word = input.nextLine();
		String temp = "";
		
		for (int i = 0; i < word.length(); i++)
		{
			int count = 0;
			char CH = word.charAt(i);
			
			if (Character.isAlphabetic(CH))
			{
				for (int j = 0; j < word.length(); j++)
				{
					if(CH == word.charAt(j)) 
					{
						count++;
					}
				}
				if (!temp.contains(CH + ""))
				{
					System.out.println(CH + " - " + count);
					temp += CH;
				}
			}
		}


	}

}
