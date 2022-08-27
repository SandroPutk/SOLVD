import java.lang.*;

public class Car implements  IMyFerrari{

    public static void main(String[] args)
    {
        Car a = new Car();
        a.Acclerate();
    }
    public void Acclerate()
    {
        System.out.println("Car is acclerating...");
    }
}
