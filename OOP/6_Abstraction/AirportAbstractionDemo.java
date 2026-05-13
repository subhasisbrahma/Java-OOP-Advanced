// Abstraction helps us to show only the relevant details and hide unnecessary details. This means we hide the implementation details from the users and expose only the functionality to the end user. Therefore, the user will only know "what it does" rather than "how it does it".

abstract class Plane 
{
    abstract public void takeOff();
    abstract public void fly();
    abstract public void land();
}

class CargoPlane extends Plane 
{
    public void takeOff()
    {
        System.out.println("CP is taking off from a long-sized runway");
    }
    public void fly()
    {
        System.out.println("CP is flying at lower height");
    }
    public void land()
    {
        System.out.println("CP is landing on a long-sized runway");
    }
}

class PassengerPlane extends Plane 
{
    public void takeOff()
    {
        System.out.println("PP is taking off from a medium-sized runway");
    }
    public void fly()
    {
        System.out.println("PP is flying at medium height");
    }
    public void land()
    {
        System.out.println("PP is landing on a medium-sized runway");
    }
}

class FighterPlane extends Plane 
{
    public void takeOff() 
    {
        System.out.println("FP is taking off from a small-sized runway");
    }
    public void fly() 
    {
        System.out.println("FP is flying at greater height");
    }
    public void land() 
    {
        System.out.println("FP is landing on a small-sized runway");
    }
}

class Airport 
{
    public void permit(Plane ref) 
    {
        ref.takeOff(); // Overridden methods
        ref.fly();     // (Not specialized)
        ref.land();
    }
}

public class AirportAbstractionDemo
{
    public static void main(String[] args) 
    {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();
        
        Airport a = new Airport();
        
        a.permit(cp);
        a.permit(pp);
        a.permit(fp);
    }
}
