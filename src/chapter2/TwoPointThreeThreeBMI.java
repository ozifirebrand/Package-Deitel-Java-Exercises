package chapter2;
import java.util.Scanner;
public class TwoPointThreeThreeBMI {
    public static void main(String[] args) {


    Scanner valueReader = new Scanner(System.in);
        System.out.println("Enter your height in metres");
        double heightInMeters = valueReader.nextDouble();

        System.out.println("Enter your weight in kilograms");
        int weightInKg = valueReader.nextInt();

    double bodyMassIndex =weightInKg/(heightInMeters*heightInMeters);

        System.out.println("Your body mass index is " +bodyMassIndex +".");
        System.out.println("""
                BMI VALUES
                Underweight: less than 18.5
                Normal: between 18.5 and 24.9
                Overweight: between 25 and 29.9
                Obese: 30 or greater""");

    }

}
