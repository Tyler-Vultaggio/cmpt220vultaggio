//Tyler Vultaggio
//2/25/20
//Lab4

import java.util.Arrays;
import java.util.Random;

public class Problem5 
{

	public static void main(String[] args) 
	{
		double [] nums = new double[1000];
        double total =0;
        double average = 0;
        int split = 0;
        Random ran = new Random();
        for(int i = 0; i < 1000; i++)
        {
            double number = ran.nextInt((10 - 0) + 1) + 0;
            nums[i] = number;
            total += number;
        }
        
        average = total / 1000;
        
        Arrays.sort(nums);
       
        for(int j = 0; j < 1000; j++)
        {
            if(nums[j] < average)
            {
                split = j;
            }
        }
        
        System.out.println("The average is " + average);
        System.out.println("There are " + split + " numbers smaller than the average");
        System.out.println("There are " + (1000-split) + " numbers larger than the average");
	}

}
