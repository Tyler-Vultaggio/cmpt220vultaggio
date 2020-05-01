//Tyler Vultaggio
//5/1/20
//Lab 10

import java.io.*;
import java.util.*;
public class ReplaceText 
{
     public static void main(String[] args) throws Exception 
     {
        // Check command-line parameter usage
        if (args.length != 3) 
        {
         System.out.println("Usage: java ReplaceText sourceFile oldStr newStr");
         System.exit(1);
        }
        
         // Check if source file exists
         File sourceFile = new File(args[0]);
         if (!sourceFile.exists()) 
         { 
             System.out.println("Source file " + args[0] + " does not exist");
             System.exit(2);
         }
        // Create a Scanner for input and a PrintWriter for output
        Scanner input = new Scanner(sourceFile);
        
        ArrayList<String> data = new ArrayList<String>();
        System.out.println(input.hasNextLine());
        while (input.hasNext()) 
        {
             String s1 = input.nextLine();
             if(s1.contains(args[1])) 
                    s1 = s1.replace(args[1], args[2]); 
             data.add(s1);
        }
        input.close();
        PrintWriter output = new PrintWriter(sourceFile);
        data.forEach(line -> output.write(line));
        output.close();
     }
}