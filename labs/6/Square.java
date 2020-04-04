//Tyler Vultggio
//4/3/2020
//Lab 6

public class Square {
    double width;      
 
    Square() {
        width = 1;
       
    }
 
    Square(double newWidth) {
        width = newWidth;
    }
 
    /** area of square */
    double getArea() {
        return width * width;
    }
 
    /** area of perimeter */
    double getPerimeter() {
        return 4 * width;
    }
}
class Problem1
{
    public static void main(String[] args)
    {
	    Square square1 = new Square(40);
	    Square square2 = new Square(35.9);
	 
	    System.out.println("\n Square 1");
	    System.out.println("-------------");
	    System.out.println("Width:     " + square1.width);
	    System.out.println("Area:      " + square1.getArea());
	    System.out.println("Perimeter: " + square1.getPerimeter());
	 
	    System.out.println("\n Square 2");
	    System.out.println("-------------");
	    System.out.println("Width:     " + square2.width);
	    System.out.println("Area:      " + square2.getArea());
	    System.out.println("Perimeter: " + square2.getPerimeter());
    }
}
