package ClassWork;
import java.util.Scanner;

public class BitFlipper {
    public static void main(String[]args){
        Scanner object = new Scanner(System.in);
        System.out.println("\"Type in your Number 1 or 0\"");
        int typeNumber = object.nextInt();

        if (typeNumber == 1){
            System.out.println("0");
        }else if (typeNumber == 0){
            System.out.println("1");
        }else{
            System.out.println("Error");

        }

    }
}
