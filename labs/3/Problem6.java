import java.util.Scanner;

//Tyler Vultaggio
//Lab 3 
//2/18/2020
public class Problem6 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Type a word :");
		String word = input.next();
		System.out.println(Vowel(word) + " this is the number of vowels in the string.");
	}
	
	public static int Vowel(String word)
	{
		int vowels = 0;
		for(int i = 0; i < word.length(); i++)
		{
			char ch = word.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				vowels++;
			}
		}
		return vowels;
	}
}
