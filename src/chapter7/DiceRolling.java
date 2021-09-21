package chapter7;

import java.security.SecureRandom;
import java.util.Arrays;

public class DiceRolling {
    /*
    User throws two die.
    The die displays two numbers between 1 and 6 that are summed
    The die are rolled 36 000 000 times and the frequency with which
        each sum i.e. between 2 and 12 appears is computed
    The result is displayed in tabular format
    As in 1 - 874638
    2 - 987904
    3 - 845829 etc

    HOW?
    A dice is thrown once at random between 1 and 6
    Another is thrown that way and the sum of the two die are calculated
    A counter reads for each of the sums
        Here, a 1 by 13 array indicating the counter based on the index
        is created.
        When the number occurs, the particular number index increases
    The sums are then tabulated as in for 2 - 4826538 times
    */


    int dice1;
    int dice2;
    int count = 0;
    String freqToString;
    int [] frequency = new int[13];



    public int throwDie(){
        SecureRandom random= new SecureRandom();
         dice1= 1 + random.nextInt(7);
         dice2= 1 + random.nextInt(7);
        return dice1+dice2;
    }

    public int[] countOccurrence(){
        while (count < 36000000){
            int sum = throwDie();
            for (int index = 0; index <frequency.length; index++){
                if( index == sum){
                    frequency[index] +=1;
                }
            }
            count++;
        }
        return frequency;
    }


    public void toStringOccurrence(){
        frequency = countOccurrence();
        System.out.printf("%3s \t\t\t %10s\n", "Sum", "Frequency");

        for (int index =0; index<frequency.length; index++) {
            if ( index > 1 ) {
                freqToString = String.format("%3d \t\t\t %10d\n", index, frequency[index]);
                System.out.println(freqToString);
            }
        }
    }

    public static void main(String[] args) {
        DiceRolling die = new DiceRolling();
        die.throwDie();
        die.countOccurrence();
        die.toStringOccurrence();

    }
}
