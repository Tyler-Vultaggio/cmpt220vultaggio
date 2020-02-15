//Tyler Vultaggio
//CMPT 220
//2/11/20
public class Problem6 
{

	public static void main(String[] args) 
	{
		int max1 = 9;
		int min1 = 2;
		int range1 = max1 - min1 + 1;
		int first = (int)(Math.random() * range1) + min1;
		
		int max2 = 99;
		int min2 = 10;
		int range2 = max2 - min2 + 1;
		int second = (int)(Math.random() * range2) + min2;
		
		int max3 = 999;
		int min3 = 100;
		int range3 = max3 - min3 + 3;
		int third = (int)(Math.random() * range3) + min3;
		
		int max4 = 9999;
		int min4 = 1000;
		int range4 = max4 - min4 + 1;
		int fourth = (int)(Math.random() * range4) + min4;
		
		System.out.println("(" + first + second + ")" + third + "-" + fourth);
		

	}

}
