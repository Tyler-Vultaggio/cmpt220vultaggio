//Tyler Vultaggio
//Project 2
//Due 5/14/2020

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriter //extends pointCalc
{	
	public static void main(String[] args) throws IOException 
	{
		FileWriter studentList = new FileWriter("studnetList.txt");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of Students you want to enter/change. (Max 10): ");
		int numberOfStudents = scan.nextInt();
		
		for(int i = 0; i < numberOfStudents; i++)
		{
			System.out.println("Information for student " + (i+1));
			String str;
			System.out.print("Enter the student's GPA: ");
			str = scan.next();
			studentList.write(str);
			studentList.write("\n");
			System.out.print("Enter the number of clubs the student is in: ");
			str = scan.next();
			studentList.write(str);
			studentList.write("\n");
			System.out.print("Has the student ever been written up? (yes or no): ");
			str = scan.next();
			studentList.write(str.toLowerCase());
			studentList.write("\n");
			System.out.print("Is the student's room clean. (yes or no): ");
			str = scan.next();
			studentList.write(str.toLowerCase());
			studentList.write("\n");
			System.out.println();
			System.out.print("\n" + "\n");
		}
		
		studentList.close();
	}
	

}
