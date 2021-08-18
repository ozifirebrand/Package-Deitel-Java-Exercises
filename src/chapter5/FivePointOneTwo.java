package chapter5;
/*
Program prints the product of the odd numbers from one to fifteen
Loop starter is 1. Loop continues as long as starter variable is not more than fifteen
Each obtained number in the loop is multiplied by an initial variable one which keeps incrementing
as loop continues.
The starter variable increments by two after every loop completes
 */
public class FivePointOneTwo {
    public static void main(String[] args) {
        int multiplier = 1;
        for (int counterBtw1And15 = 1; counterBtw1And15 <= 15; counterBtw1And15+=2){
            multiplier *= counterBtw1And15;
        }
        System.out.println(multiplier);
    }
}
