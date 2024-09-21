package chapter15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class ReadingFiles {
    public static void main(String[] args) throws IOException {
//        File file = new File(".");
//        for (String fileName: Objects.requireNonNull(file.list())) System.out.println(fileName);
        File file2 = new File("src\\chapter15\\house.csv");
//        String path = "heroku.txt";
//        Scanner document = input(path);
//        Formatter output = output(path);
//        readCsv(file);
        readCsv(file2);
    }

    public static Scanner input(String path) throws IOException {
        return new Scanner(Paths.get(path));
    }

    public static Formatter output(String path) throws FileNotFoundException {
        return new Formatter(path);
    }

    public static void readCsv(File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        sc.useDelimiter(",");
//        System.out.printf("%s -%30s %20s%n", "Location", "Price/Sqft", "Status");
        while (sc.hasNext())
        {
            System.out.printf("%s -%20s -%20s-%20s -%20s -%20s %-20s %-20s%n ",sc.next(), sc.next(), sc.next(), sc.next(),sc.next(),sc.next(),sc.next(), sc.next() );

            //find and returns the next complete token from this scanner
        }
        sc.close();  //closes the scanner
    }
}
