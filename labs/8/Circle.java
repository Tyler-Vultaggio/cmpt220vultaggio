//Tyler Vultaggio
//4/17/20
//Lab 8

abstract class Circle
{
	private double radius;
	private String color;

	public Circle()
	{
		radius = 1.0;
		color = "red";
	} 
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	public Circle(double radius, String color)
	{
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public double getArea()
	{
		return ((Math.PI) * (radius * radius));
	}
	
	public String toString()
	{
		return "Circle[radius=r,color=c]";
	}
	
}


class Cylinder extends Circle
{
	private double height;
	
	public Cylinder()
	{	
		super();
		height = 1.0;
	}
	
	public Cylinder(double radius)
	{
		super(radius);
	}
	
	public Cylinder(double radius, double height)
	{
		super(radius);
		this.height = height;
	}
	
	public Cylinder(double radius, double height, String color)
	{
		super(radius,color);
		this.height = height;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	public double getVolume()
	{
		return super.getArea() * height;
	}
}

class TestCylinder { // save as "TestCylinder.java"
	 public static void main (String[] args) 
	 {
	 // Declare and allocate a new instance of cylinder
	 // with default color, radius, and height
	 Cylinder c1 = new Cylinder();
	 System.out.println("Cylinder:"
	 + " radius=" + c1.getRadius()
	 + " height=" + c1.getHeight()
	 + " base area=" + c1.getArea()
	 + " volume=" + c1.getVolume());

	 // Declare and allocate a new instance of cylinder
	 // specifying height, with default color and radius
	 Cylinder c2 = new Cylinder(10.0);
	 System.out.println("Cylinder:"
	 + " radius=" + c2.getRadius()
	 + " height=" + c2.getHeight()
	 + " base area=" + c2.getArea()
	 + " volume=" + c2.getVolume());
	 // Declare and allocate a new instance of cylinder
	 // specifying radius and height, with default color
	 Cylinder c3 = new Cylinder(2.0, 10.0);
	 System.out.println("Cylinder:"
	 + " radius=" + c3.getRadius()
	 + " height=" + c3.getHeight()
	 + " base area=" + c3.getArea()
	 + " volume=" + c3.getVolume());
	 }
}








