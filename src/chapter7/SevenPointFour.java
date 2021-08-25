package chapter7;

public class SevenPointFour {

    public static final int ARRAY_SIZE = 3;
    public static void main(String[] args) {

        int[][] table = new int[ARRAY_SIZE][ARRAY_SIZE];

        //table.length is the number of rows in the array

        for (int counter = 0; counter < table.length; counter++){
            for (int index = 0; index <= ARRAY_SIZE; index++){
                System.out.println(index);
            }
            System.out.println();
        }
    }
}
