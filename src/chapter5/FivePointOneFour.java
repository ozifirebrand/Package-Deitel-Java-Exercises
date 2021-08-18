package chapter5;

import java.util.Scanner;

/*Program calculates the compound interest using the following formula below
After computation, the rate increases by one percent and the interest is calculated again
This continues till interest rises to 10 percent
 */
public class FivePointOneFour {
    double amount;
    public void principalCalculator(){
        java.util.Scanner scanner = new Scanner(System.in);
        System.out.println("Principal: ");
        double principal = scanner.nextDouble();
        System.out.println("Rate: ");
        double rate = scanner.nextDouble();
        System.out.println("Time");
        int time = scanner.nextInt();
        amount = principal * Math.pow((1 + rate), time);

        System.out.printf("Amount in %d years is %.2f Naira", time, amount);
    }

   public  void increasingRate(int rate){

              Scanner scanner = new Scanner(System.in);
               System.out.println("P: ");
               double principal = scanner.nextDouble();
               System.out.println("T");
               int time = scanner.nextInt();
       while (rate <=10){
               amount = principal * Math.pow((1 + rate/100.0), time);

               System.out.printf("Amount in %d years is %.2f Naira at rate %.2f%%", time, amount, rate/100.0);

               rate++;
               System.out.println();
           }
       }


    public static void main(String[] args) {
        FivePointOneFour interest = new FivePointOneFour();
        //interest.principalCalculator();
        interest.increasingRate(5);

    }
//amount = principal (1 + r)^t
}
