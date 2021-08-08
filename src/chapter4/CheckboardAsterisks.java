package chapter4;

public class CheckboardAsterisks {
    public static void main(String[] args) {
        int row = 1;
        int column = 1;
        String asterisks = "*";

        for (column = 1; column <= 8; column+=2) {

            for (row = 1; row <= 8; row++) {
                System.out.print("   " + asterisks);
            } System.out.println("");

            for (row=1; row<=8; row++){
                System.out.print(asterisks +"   ");
            }
            System.out.println("");

        }
    }
}