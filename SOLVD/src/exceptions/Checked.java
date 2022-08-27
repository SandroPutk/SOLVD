package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked {

    private static String s;

    public static void main(String args[])throws FileNotFoundException  {
        File file = new File("C://Data.txt");
        FileReader fr = new FileReader(file);
    }


}