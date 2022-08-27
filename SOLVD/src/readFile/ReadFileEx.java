package readFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ReadFileEx {

    public static void main(String[] args) throws IOException {
        String fileName = "Enter Your adress";

        readUsingFiles(fileName);

        readUsingScanner(fileName);

        readUsingBufferedReader(fileName);
        readUsingBufferedReaderJava7(fileName, StandardCharsets.UTF_8);
        readUsingBufferedReader(fileName, StandardCharsets.UTF_8);


        readUsingFileReader(fileName);
    }

    private static void readUsingFileReader(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        System.out.println("Reading text file using FileReader");
        while((line = br.readLine()) != null){

            System.out.println(line);
        }
        br.close();
        fr.close();

    }

    private static void readUsingBufferedReader(String fileName, Charset cs) throws IOException {
        File file = new File(fileName);
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis, cs);
        BufferedReader br = new BufferedReader(isr);
        String line;
        System.out.println("Read text file using InputStreamReader");
        while((line = br.readLine()) != null){

            System.out.println(line);
        }
        br.close();

    }

    private static void readUsingBufferedReaderJava7(String fileName, Charset cs) throws IOException {
        Path path = Paths.get(fileName);
        BufferedReader br = Files.newBufferedReader(path, cs);
        String line;
        System.out.println("Read text file using BufferedReader Java 7 improvement");
        while((line = br.readLine()) != null){

            System.out.println(line);
        }
        br.close();
    }

    private static void readUsingBufferedReader(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        System.out.println("Read text file using BufferedReader");
        while((line = br.readLine()) != null){

            System.out.println(line);
        }

        br.close();
        fr.close();
    }

    private static void readUsingScanner(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path);
        System.out.println("Read text file using Scanner");

        while(scanner.hasNextLine()){

            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }

    private static void readUsingFiles(String fileName) throws IOException {
        Path path = Paths.get(fileName);

        byte[] bytes = Files.readAllBytes(path);
        System.out.println("Read text file using Files class");
        @SuppressWarnings("unused")
        List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);
        System.out.println(new String(bytes));
    }
}