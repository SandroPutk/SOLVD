import java.lang.*;

public class MyCar implements  IMyCar{

    public static void main(String[] args) {
        MyCar b = new MyCar();
        b.Break();
        b.Stop();
    }
    public void Break() {
        System.out.println("Car is Breaking...");
    }

    public void Stop()
    {
        System.out.println("Car is stopping...");
    }
}
