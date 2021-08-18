package chapter5;
/*
Program receives input and finds the factorial of the input
How
    The no is the starting condition for the loop to start
    Number is multiplied by a multiplier which is one in this case
    Number is decreased by one and multiplied by multiplier till number becomes 1
 */
public class FivePointOneThree {

    int multiplier = 1;
    public void factorialMethod(int input){
        for (int number = input; number>=1; number--){
            multiplier *= input;
            input--;
        }
        System.out.println(multiplier);
    }

    public static void main(String[] args) {
        FivePointOneThree factorial = new FivePointOneThree();
        factorial.factorialMethod(6);
    }
}
