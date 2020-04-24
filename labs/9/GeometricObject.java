//Tyler Vultaggio
//4/24/20
//Lab 9

import java.util.Scanner;
 
public class GeometricObject
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
 
        boolean repeatSidesInput = true;
        do
        {
            System.out.print("Enter the three sides of the triangle: ");
            double side1 = input.nextDouble();     
            double side2 = input.nextDouble();     
            double side3 = input.nextDouble();
   
            try
            {
                Triangle triangle = new Triangle(side1, side2, side3);
                repeatSidesInput = false;  
       
                System.out.println(triangle.toString());
                System.out.print("This is a legal triangle.");
            }
            catch (IllegalTriangleException ex) {
                System.out.println(ex.getMessage());
            }
 
        } while (repeatSidesInput);
    }
}
class IllegalTriangleException extends Exception
{
    private double side1;
    private double side2;
    private double side3;
 
    /** Construct an IllegalTriangleException */
    public IllegalTriangleException(double side1, double side2, double side3)
    {
        super("Illegal sides " + side1 + " " + side2 + " " + side3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
 
    /** Return side1 */
    public double getSide1()
    {
        return side1;
    }
 
    /** Return side2 */
    public double getSide2()
    {
        return side2;
    }
 
    /** Return side3 */
    public double getSide3()
    {
        return side3;
    }
}
 
class Triangle extends GeometricObject
{
    private double side1;
    private double side2;
    private double side3;
 
    public Triangle()
    {
        side1 = side2 = side3 = 1.0;
    }
 
    public Triangle(double side1, double side2, double side3)
            throws IllegalTriangleException
    {
        if (side1 + side2 <= side3 ||
                side1 + side3 <= side2 ||
                side2 + side3 <= side1)
            throw new IllegalTriangleException(side1, side2, side3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
 
 
    public double getSide1()
    {
        return side1;
    }
 
 
    public double getSide2()
    {
        return side2;
    }
 
 
    public double getSide3()
    {
        return side3;
    }
 
    @Override
public String toString()
    {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
 
 
}