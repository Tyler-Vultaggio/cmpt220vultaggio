//Tyler Vultaggio
//4/17/20
//Lab 8

class Rodent
{
    void gnaw()
    {
        System.out.println("Rodent is gnawing");
    }
    void eat()
    {
        System.out.println("Rodent is eating");
    }
}
class Mouse extends Rodent
{
    void gnaw()
    {
        System.out.println("Mouse is gnawing");
    }
    void eat()
    {
        System.out.println("Mouse is eating");
    }
}
class Gerbil extends Rodent
{
    void gnaw()
    {
        System.out.println("Gerbil is gnawing");
    }
    void eat()
    {
        System.out.println("Gerbil is eating");
    }
}
class Hamster extends Rodent
{
    void gnaw()
    {
        System.out.println("Hamster is gnawing");
    }
    void eat()
    {
        System.out.println("Hamster is eating");
    }
}
public class Rodents
{
    public static void main(String [] args)
    {
        Rodent[] animal = {
                new Rodent(),
                new Mouse(),
                new Gerbil(),
                new Hamster()
        };
        for(Rodent x: animal)
        {
            x.gnaw();
            x.eat();
           
        }
    }
}
