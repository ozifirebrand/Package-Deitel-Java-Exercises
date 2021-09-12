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
            System.out.println(fibonacci);
        }
    }
    public static void main(String[] args) {
        findFibonacci(19);
    }
}
    /*User inputs a parameter into a method
    The method calculates the number's findFibonacci
        How to find the findFibonacci of each number
            Start from the zeroth and first findFibonacci and add them
            This is equal to the next findFibonacci
            The new findFibonacci and the last number will be added to give the nth
            findFibonacci and so on until the nth number is reached
     */