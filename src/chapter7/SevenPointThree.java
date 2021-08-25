package chapter7;

public class SevenPointThree {
    public static final int ARRAY_SIZE = 10;
    public static void main(String[] args) {
        double[] array = new double[ARRAY_SIZE-1];

        array[8] = 1.667;
        array[6] = 3.333;
        double total = 0;

        for (double number: array){
            total += number;
        }
        System.out.println(total);
    }
}