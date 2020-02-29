//Tyler Vultaggio
//2/26/2020
//Lab 4

import java.util.Scanner;
import java.util.Arrays;

public class Problem7 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
    	int arr[] =  new int[10];
    	for (int i = 0; i < arr.length; i++) 
    	{
			System.out.print("Give 10 numbers for the array and we will remove any duplicates: ");
		    arr[i] = input.nextInt();
		}
      
        Arrays.sort(arr);
        int length = arr.length;  
        length = removeDuplicates(arr, length);  
          
        for (int i=0; i<length; i++) 
        {
           System.out.print(arr[i]+" ");  
        } 

	}
	public static int removeDuplicates(int arr[], int arrayLength)
	{  
        int[] tempArray = new int[arrayLength];  
        int j = 0;  
        for (int i = 0; i < arrayLength -1; i++)
        {  
            if (arr[i] != arr[i+1])
            {  
            	tempArray[j++] = arr[i];  
            }  
         }  
        tempArray[j++] = arr[arrayLength-1];     
       
        for (int i = 0; i < j; i++){  
            arr[i] = tempArray[i];  
        }  
        return j;  
    }  

}
