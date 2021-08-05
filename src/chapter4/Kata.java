package chapter4;
/* FACTORIAL
When number is inputted, the factorial is computed
    How?
    The input is decremented by one and multiplied till number on

This is saved as the factorial value
The system displays factorial of the number is output.
 */


        /* method takes in the number of units to be bought

prices are cheaper for resellers
if it's 1-4 its 1500 per copy
5-9 its 1400
10-29 1200
30-49 1100
50-99 1000
100-199 900
200-above 800

Display total sum based on unit price * total
 */


public class Kata {
    int unitPrice = 1500;
    int totalPriceOfPastQuestions;
    public int getPrice(int numberOfPqs) {
        boolean numberOfPqsLessThan5 = numberOfPqs>=1 && numberOfPqs <=5;
        if (numberOfPqsLessThan5) {
            unitPrice = 1500;
        }
        boolean numberOfPqsLessThan10 = numberOfPqs>=5 && numberOfPqs <=9;
        if (numberOfPqsLessThan10){
            unitPrice = 1400;
        }

        boolean numberOfPqsLessThan30 =numberOfPqs>=10 && numberOfPqs <=29;
        if (numberOfPqsLessThan30){
            unitPrice = 1200;
        }
        boolean numberOfPqsLessThan50 =numberOfPqs>=30 && numberOfPqs <=49;
        if (numberOfPqsLessThan50){
            unitPrice = 1100;
        }

        boolean numberOfPqsLessThan100 =numberOfPqs>=50 && numberOfPqs <=99;
        if (numberOfPqsLessThan100){
            unitPrice = 1000;
        }

        boolean numberOfPqsLessThan200 =numberOfPqs>=100 && numberOfPqs <=199;
        if (numberOfPqsLessThan200){
            unitPrice = 900;
        }

        boolean numberOfPqsGreaterThan200 =numberOfPqs>=200;
        if (numberOfPqsGreaterThan200){
            unitPrice = 800;
        }

      totalPriceOfPastQuestions = numberOfPqs * unitPrice;
        return totalPriceOfPastQuestions;

    }

    public static void main(String[] args) {
        Kata kata = new Kata();
        System.out.println(kata.getPrice(59));

    }
}



//    private int factorialValue=1;
//    private int counter = 0;
//
//    public int findFactorial(int input) {
//
//        while ( counter <= (input+1) ){
//            factorialValue = factorialValue * input;
//            input -= 1;
//            counter += 1;
//        }
//        return factorialValue;

//}

//
//    public int returnFactorial(){
//        return factorialValue;
