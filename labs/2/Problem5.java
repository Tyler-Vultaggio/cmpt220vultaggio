import java.util.Scanner;

//Tyler Vultaggio
//CMPT 220
//2/11/20
public class Problem5 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first word: ");
		String word1 = input.next();
		System.out.print("Enter the second word: ");
		String word2 = input.next();
		
		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();
		
		int length;
		
		if(word1.length() > word2.length())
		{
			length = word2.length();
		}
		else
		{
			length = word1.length();
		}
		
		for(int i = 0; i < length; i++)	
		{
			if(word1.charAt(i) < word2.charAt(i))
			{
				System.out.println(word1);
				System.out.println(word2);
				break;
			}
			else if(word1.charAt(i) > word2.charAt(i))
			{
				System.out.println(word2);
				System.out.println(word1);
				break;
			}
		}

	}

}
