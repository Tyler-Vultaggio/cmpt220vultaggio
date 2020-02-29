//Tyler Vultaggio
//2/25/20
//Lab4

import java.util.*;

public class Problem3 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string to see if it is a palindrome: ");
		String myInput = input.nextLine();
		boolean y = isPalindrome(myInput);
		System.out.println(myInput + " is a palinrome: " + y);
		
	}
	
	public static String reverse(String s) 
	{
		String reverseString = "";
		int stringLength = s.length();
		
		for (int i = stringLength - 1; i >= 0; i--)  
	         reverseString = reverseString + s.charAt(i);
		
		return reverseString;
	}
	
	public static boolean isPalindrome(String s) 
	{
		s = s.toLowerCase();
		String x = reverse(s);
		if (s.equals(x))  
	         return true;
	      else  
	         return false;  
	}

}
