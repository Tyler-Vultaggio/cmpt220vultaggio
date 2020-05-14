//Tyler Vultaggio
//Project 2
//Due 5/15/2020

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class pointCalc //extends studentINFO
{

	public static void main(String[] args) throws IOException 
	{
		int user = 0;
		while(user != 3)
		{
			Scanner scan = new Scanner(System.in); 
			System.out.println("What would you like to do?");
			System.out.println("1. Enter new values for students.");
			System.out.println("2. Calculate a student's proity points.");
			System.out.println("3. Quit");
			System.out.print("Enter 1, 2, or 3: ");
			user = scan.nextInt();
			
			if(user == 1)
			{
				System.out.println("When doing this it will always start form the first student in the file.");
				fileWriter.main(args);
			}
			else if(user == 2)
			{
				double points = 0;
				ArrayList<Object> studentsList = new ArrayList<Object>(40);
				studentsList = fileReader.readStudent();
				System.out.print("What student's proity points would you like to calculate. ");
				int studentNum = scan.nextInt();
				studentINFO student = new studentINFO();
				student = (studentINFO) studentsList.get(studentNum-1);
				points = points + GPAToPoints(student.getGPA());
				points = points + ClubsToPoints(student.getClubs());
				points = points + RAToPoints(student.getRA());
				points = points + CleanToPoints(student.getClean());
				System.out.println("\n");
				System.out.println("This student's proity points are: " + points);
				
			}
			else if(user == 3)
			{
				break;
			}
			else
			{
				System.out.print("That is not a choice.");
			}
		}
	}
	
	public static double GPAToPoints(double GPA)
	{
		//Array of GPA values to Points
		double[][] numbers = { {3.85, 12}, {3.60, 11}, {3.25, 10}, {3.00, 9}, 
							   {2.75, 7}, {2.50, 6}, {2.25, 5}, {2.00, 4}, 
							   {0.50, 1}, {0.00, 0} };
		
		
		for(int i = 0; i < numbers.length; i++)
		{	
			
			if(GPA >= numbers[i][0])
			{
				return numbers[i][1];
			}
			
		}
		
		return 0.0;
				
	}
	
	public static double ClubsToPoints(int clubs)
	{
		if(clubs <= 0)
		{
			return 0;
		}
		else if(clubs == 1)
		{
			return 1;
		}
		else if(clubs == 2)
		{
			return 2;
		}
		else
		{
			return 2;
		}
		
	}
	
	public static double RAToPoints(String RA)
	{
		if(RA.equals("no"))
		{
			return 6;
		}
		return 0;
	}
	
	public static double CleanToPoints(String clean)
	{
		if(clean.equals("yes"))
		{
			return 6;
		}
		return 0;
	}

}
