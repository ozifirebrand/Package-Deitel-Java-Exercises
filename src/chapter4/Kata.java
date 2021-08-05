package chapter4;
/* FACTORIAL
When number is inputted, the factorial is computed
    How?
    The input is decremented by one and multiplied till number on

This is saved as the factorial value
The system displays factorial of the number is output.
 */


public class Kata {
    private int factorialValue=1;
    private int counter = 0;

    public int findFactorial(int input) {

        while ( counter <= (input+1) ){
            factorialValue = factorialValue * input;
            input -= 1;
            counter += 1;
        }
        return factorialValue;

}
}
//
//    public int returnFactorial(){
//        return factorialValue;
