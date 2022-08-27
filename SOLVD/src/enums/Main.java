enum Go {
    Right, Left, straight
}
public class Main {
    public static void main(String[] args)
    {
        Go myChoose = Go.straight;
        switch(myChoose) {
            case Right:
                System.out.println("I'm going to the Right...");
                break;
            case Left:
                System.out.println("I'm going to the Left...");
                break;
            case straight:
                System.out.println("i'am Going straight...");
                break;
        }
    }
}