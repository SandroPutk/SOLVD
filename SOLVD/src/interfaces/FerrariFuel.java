import java.lang.*;
public class FerrariFuel implements IFerrariFuel{
    public static void main(String[] args)
    {
        FerrariFuel c = new FerrariFuel();

        c.Fuel();
    }
    public void Fuel() {
        System.out.println("UR Ferrari is Refueling...");
    }
}
