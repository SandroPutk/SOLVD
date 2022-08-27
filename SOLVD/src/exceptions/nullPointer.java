package exceptions;

public class nullPointer {
    private static String str;


    public static void main(String[] args) {
        str = "example";

        foo(null);
        bar(null);
    }


    static void foo(String abc) {
        try {
            System.out.println("First character in the string is:\n" + abc.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }


    static void bar(String abc) {
        if(abc == null)
            System.out.println("First character in the string is:\n"+ abc.charAt(0));
        else
            System.out.println("NullPointerException");

    }
}
