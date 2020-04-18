//Tyler Vultaggio
//4/17/20
//Lab 8

abstract class Shape 
{
    String shapeName;
    
    abstract double area();
    
    public String toString() 
    {
        return shapeName;
    } 
}

class Sphere extends Shape
{
    double radius = 1.0; 
    double area() 
    {
        return Math.pow(4 * Math.PI * radius, 2);
    }
}

class Rectangle extends Shape
{
    double length = 1.0; 
    double width = 1.0; 
    double area() 
    {
        return length * width;
    }
}

class Cylinder2 extends Shape
{
    double radius = 1.0; 
    double height = 1.0;
    double area() 
    {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}