//Tyler Vultaggio
//4/3/2020
//Lab 6

public class Bond
{
    double price;
    int payment;
    double interest;
    double valueMaturity;
   
    Bond(double newCouponPrice, int newPayment, double newInterest, double newValueMaturity)
    {
        price = newCouponPrice;
        payment = newPayment;
        interest = newInterest;
        valueMaturity = newValueMaturity;
    }
    Bond(){
   
        price = 500;
        payment = 100;
        interest = 0.05;
        valueMaturity = 10000;
       
    }
   
   
    public double getPrice() {
   
        double bottom = 1 + interest;
        double bottom1 = Math.pow(bottom, payment);
        double whole = 1/bottom1;
        double whole1 = 1-whole;
        double left = price * whole1;
        double rightbottom = 1+interest;
        double rightbottom1 = Math.pow(rightbottom, payment);
        double rightwhole = 1/rightbottom1;
        double right = valueMaturity * rightwhole;
        double price = left + right;
       
        return price;
    }
}
class Problem2
{
    public static void main(String [] args)
    {
        Bond bond1 = new Bond();
        System.out.print(bond1.getPrice());
       
    }
}
