//Tyler Vultaggio
//Project 2
//Due 5/14/2020


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class fileReader //extends studentINFO
{

	public static void main(String[] args) throws IOException 
	{
		ArrayList<Object> studentsList = new ArrayList<Object>(40);
		studentsList = readStudent();
		System.out.println(studentsList);
		studentINFO student = new studentINFO();
		student = (studentINFO) studentsList.get(0);
		System.out.println(student.getRA() + "1");

	}
	
	
	//;
	//return GPA + "\n" + clubs + "\n" + RA + "\n" + clean;
	
	public static  ArrayList<Object> readStudent() throws IOException
	{
		File fileRead = new File("studnetList.txt");
		Scanner scan = new Scanner(fileRead);
		ArrayList<Object> studentsList = new ArrayList<Object>(40);
		while(scan.hasNext())
		{
			String GPA1 = scan.nextLine();
			String clubs1 = scan.nextLine();
			String RA = scan.nextLine();
			String clean = scan.nextLine();
			double GPA = Double.parseDouble(GPA1);
			int clubs = Integer.parseInt(clubs1);
			//System.out.println(GPA + " " + clubs + " " + RA + " " + clean);
			studentINFO newStudent = new studentINFO(GPA, clubs, RA, clean);
			studentsList.add(newStudent);
		}
		
		return studentsList;
	}

}
