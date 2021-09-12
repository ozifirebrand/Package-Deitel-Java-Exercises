package chapter7;

import java.util.ArrayList;

public class FibonacciSequence {
    public static void findFibonacci(int n) {
        int zerothTerm = 0;
        int firstTerm = 1;
        ArrayList<Integer> fibonacci = new ArrayList<Integer>(n);
        fibonacci.add(zerothTerm); fibonacci.add(firstTerm);

        if ( n==0) System.out.println("0");
        else if ( n==1) System.out.println("1");
        else {
            int i = 2;
            while (i < n) {
                int number = fibonacci.get(i - 1) + fibonacci.get(i - 2);
                fibonacci.add(number);
                i++;
            }
        }
        System.out.println(fibonacci);
    }


    public static void main(String[] args) {
        findFibonacci(7);
    }
}

    /*User inputs a parameter into a method
    The method calculates the number's findFibonacci
        How to find the findFibonacci of each number
            Start from the zeroth and first findFibonacci and add them
            This is equal to the next findFibonacci
            The new findFibonacci and the last number will be added to give the nth
            findFibonacci and so on until the nth number is reached


          An array list saves the zeroth and first terms
          the next findFibonacci == the sum of the last two terms.
          add the new findFibonacci into the list and reiterate until
          the number is equal to the index

        The 0th and 1st terms are 0 and 1.
        The 2nd findFibonacci is a sum of the zeroth and first findFibonacci
        The 3rd findFibonacci is the sum of the second and first findFibonacci etc

        int secondTerm = zerothTerm + firstTerm;
        int thirdTerm = secondTerm + firstTerm;
        int fourthTerm = thirdTerm + secondTerm;
        int nthTermMinusOne = 5;
        int nthTermMinusTwo = 2;
        int nthTerm = nthTermMinusOne + nthTermMinusTwo;


     */