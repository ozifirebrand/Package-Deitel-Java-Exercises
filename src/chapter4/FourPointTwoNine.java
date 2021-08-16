package chapter4;
import  java.util.Scanner;
public class FourPointTwoNine {
    public static void main(String[] args) {
        printSquare();


    }

    public static void printSquare(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter square side below");
        int squareSide = scanner.nextInt();
        printAsterisks(squareSide);
        System.out.println();
        printHollowAndRows(squareSide);
        printAsterisks(squareSide);
    }
        private static void printHollowAndRows(int squareSide) {
            for (int row = 0; row < squareSide - 2; row++) {
                for (int column = 0; column < 1; column++) {
                    System.out.print("*");
                }
                for (int column = 2; column < squareSide; column++) {
                    System.out.print("   ");
                }
                for (int column = 0; column < 1; column++) {
                    System.out.print("  ");
                }
                for (int column = 0; column < 1; column++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        private static void printAsterisks(int squareSide){
            for (int column = 1; column <= squareSide; column++) {
                System.out.print("*  ");
            }
        }
    }


//        Scanner scanner = new Scanner(System.in);
//        for (int counterNo = 1; counterNo <= 10; counterNo++) {
//        System.out.println("\nEnter size of square here --> ");
//        int squareSide = scanner.nextInt();
//
//        if(squareSide==1){
//            System.out.println("*");
//        }else {
//            for (int column = 1; column <= squareSide; column++) {
//                System.out.print("*  ");
//            }
//            System.out.println();
//
//            for (int row = 0; row < squareSide - 2; row++) {
//                for (int column = 0; column < 1; column++) {
//                    System.out.print("*");
//                }
//                for (int column = 2; column < squareSide; column++) {
//                    System.out.print("   ");
//                }
//                for (int column = 0; column < 1; column++) {
//                    System.out.print("  ");
//                }
//                for (int column = 0; column < 1; column++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//            for (int column = 1; column <= squareSide; column++) {
//                System.out.print("*  ");
//            }
//        }
//            System.out.print("\t\t");
//        }
//
