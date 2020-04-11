//Tyler Vultaggio
//4/10/2020
//Lab 7

public class MyLong 
{
	private long value;

    public MyLong(long value) 
    {
        this.value = value;
    }

    public long getValue()
    {
        return value;
    }

    public boolean isEven() 
    {
    	if(value % 2 == 0)
    		return true;
    	return false;
    }

    public boolean isOdd() 
    {
        if(value % 2 == 1)
        	return true;
        return false;
    }

    public boolean isPrime() 
    {
        if (value == 1 || value == 2)
            return true;
        else
            for (int i = 2; i < value; i++)
                if (value % i == 0) return false;
        return true;
    }

    public static boolean isEven(long mylog)
    {
        if(mylog % 2 == 0)
        	return true;
        return false;
    }

    public static boolean isOdd(long mylog) 
    {
        if(mylog % 2 == 1)
        	return true;
        return false;
    }

    public static boolean isPrime(long mylog)
    {
        if (mylog == 1 || mylog == 2)
            return true;
        else
            for (int i = 2; i < mylog; i++) 
                if (mylog % i == 0) return false;
        return true;
    }    

    public static boolean isEven(MyLong mylog) 
    {
        return mylog.isEven();
    }

    public static boolean isOdd(MyLong mylog) 
    {
        return mylog.isOdd();
    }

    public static boolean isPrime(MyLong mylog)
    {
        return mylog.isPrime();
    }

    public boolean equals(long testLong)
    {
        if (testLong == value) 
            return true;
        return false;
    }

    public boolean equals(MyLong mylog) 
    {
        if (mylog.value == this.value) 
            return true;
        return false;
    }

    public static long parseLong(char[] values) 
    {
        int sum = 0;
        for (char i : values)
            sum += Character.getNumericValue(i);
        return sum;
    }

    public static long parseLong(String value) 
    {
        return Long.parseLong(value);
    }
}

/*class MyLongMain
{
	public static void main(String[] args) 
	{
		MyLong long1 = new MyLong(18);
	    MyLong long2 = new MyLong(56);
	    MyLong long3 = new MyLong(9);
	    MyLong long4 = new MyLong(23);

	    System.out.println(long1.getValue() + " is even? " + long1.isEven());
	    System.out.println(long2.getValue() + " is even? " + long2.isEven());
	    System.out.println(long3.getValue() + " is even? " + long3.isEven());

	    System.out.println("93 is odd? " + MyLong.isOdd(93));
	    
	    System.out.println(long1.getValue() + " is prime? " + long1.isPrime());
	    System.out.println(long2.getValue() + " is prime? " + long2.isPrime());
	    System.out.println(long3.getValue() + " is prime? " + long3.isPrime());
	        
	    System.out.println(long1.getValue() + " equals " + long4.getValue() + "?" + long1.equals(long4));

	    System.out.println(MyLong.parseLong(new char[] {'5', '2', '7', '4'}));
	    System.out.println(MyLong.parseLong("34"));
	    }
}
*/
