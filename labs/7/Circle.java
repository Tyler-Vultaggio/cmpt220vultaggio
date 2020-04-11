//Tyler Vultaggio
//4/10/2020
//Lab 7

import java.util.*;

public class Circle 
{
	private double x;
	private double y;
	private double radius;
	
	public Circle()
	{
		x = 0;
		y = 0;
		radius = 1;
	}
	
	public Circle(double point1, double point2, double across) 
	{
		x = point1;
		y = point2; 
		radius = across;
	}

	public double getX() 
	{
		return x;
	}

	public double getY()
	{
		return y;
	}

	public double getRadius() 
	{
		return radius;
	}
	
	public double getArea()
	{
		return (Math.PI) * (radius *radius);
	}
	
	public double getPerimeter() 
	{
		return (2) * (Math.PI) * (radius);
	}
	
	public boolean Contains(double xx, double yy) 
	{
		double distance = Math.sqrt(Math.pow(xx - x, 2)+ Math.pow(yy-y, 2));
		if (distance < radius)
			return true;
		return false;
	}
	
	public boolean Contains(Circle circle2) 
	{
		double distance = Math.sqrt(Math.pow(circle2.getX() - x, 2) + Math.pow(circle2.getY() - y, 2));
		if(distance <= Math.abs(radius + circle2.getRadius()))
			return true;
		return false;
	}
	
	public boolean OverLaps(Circle circle2)
	{
		double distance = Math.sqrt(Math.pow(circle2.getX() - x, 2) + Math.pow(circle2.getY() - y, 2));
		if(distance <= radius + circle2.getRadius())
			return true;
		return false;				
	}
}

/*class CircleTester 
{

	public static void main(String[] args) 
	{
		Circle c1 = new Circle(2,2,5.5);
		System.out.println("Circle Area: " + c1.getArea());
		System.out.println("Circle Perimeter: " + c1.getPerimeter());
		System.out.println(c1.Contains(3,3));
		System.out.println(c1.Contains(new Circle(4,5,10.5)));
		System.out.println(c1.OverLaps(new Circle(3,5,2.3)));
	}
}
*/