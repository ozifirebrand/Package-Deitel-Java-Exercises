package chapter4;
/*Loops starts from one and is multiplied by a new value initialised to one
Display shows the first output
Loop increases by 2
New loop value is multiplied by previous loop value up till the 15th loop
 */

public class FourPointOneTwo {
    public static void main(String[] args) {
        int noOfLoops =1;
        int newNoOfLoops =1;
        while (noOfLoops <= 15){
            newNoOfLoops *= noOfLoops;

            noOfLoops+=2;
            //System.out.println(noOfLoops);
        }
        System.out.println("Multiplication of the numbers from 1 to 15 is" +
                "\n"+newNoOfLoops);
    }
}
