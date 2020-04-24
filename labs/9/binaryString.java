//Tyler Vultaggio
//4/24/20
//Lab 9

public class binaryString 
{
    public static void main(String[] args) 
    {
    	
    }
    
    public static int bin2Dec(String binaryString)
    {
        
        double j=0;
        for(int i=0; i < binaryString.length(); i++)
        {
            if(binaryString.charAt(i)== '1' || binaryString.charAt(i)== '0') 
            {
                throw new  NumberFormatException();
            }
            if(binaryString.charAt(i)== '1')
            {
                j = j+ Math.pow(2, binaryString.length()-1-i);
            }

        }
        return (int) j;
    }
}