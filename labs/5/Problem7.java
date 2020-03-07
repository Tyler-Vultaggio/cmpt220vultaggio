
public class Problem7
{
	public static void main(String[] args) 
	{
		double[][] Array = {{3, 5, 1}, { 0, 8, -2}, {0, 0, -3}};
		System.out.println(isUpperTriangular(Array));
	}
	
	public static boolean isUpperTriangular(double[][] array) 
	{
		for (int i = 0; i < array.length; i++) 
		{        
	         for (int j = 0; j < array[i].length; j++) 
	         {   
	            if(i > j) 
	            	if(array[i][j] != 0) 
	            		return false;
	         }
	     }
		return true;
	}
}