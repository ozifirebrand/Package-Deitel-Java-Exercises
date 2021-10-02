package chapter7;

import java.security.SecureRandom;
import java.util.Arrays;

public class   TortoiseAndHare {
    /*Contenders are hare and tortoise
    70x70 squares which are positions for the race
    Random numbers are generated.
    FOR THE TORTOISE
        If random number is between 1 and 5, perform a fast plod
        else if they are between 6 and 7, a slip
        else it is a plod
    FOR THE HARE
        If the random number generated is between 1 and 2, sleep
        else if it between 3 and 4, big hop
        else if it's 5, big slip
        else if it's between 6 and 8, small hop
        else if it is between 9 and 10, small slip

    To start, BANG.
    T for Tortoise and H for Hare
    If Hare meets Tortoise, Tortoise bites Hare, so ouch

    For each movement, check if any of the animals has crossed the line 70
    If yes, terminate. If no, continue to move
    If it's a tie for the animals, restart game

     */
    public static int generateRandomForHare(){
        SecureRandom newRandom = new SecureRandom();
        return 1+ newRandom.nextInt( 10);
    }

    public static int generateRandomForTortoise(){
        SecureRandom newRandom = new SecureRandom();
        return 1+ newRandom.nextInt( 10);
    }

    public static int validateHareInput(){
        //An array initialisation is necessary here

        int movement=0;
        int hareValue = generateRandomForHare();
        boolean sleep = hareValue >0 && hareValue < 3;
        boolean hop = hareValue >= 3 && hareValue <=4;
        boolean bigSlip = hareValue == 5;
        boolean smallHop = hareValue >= 6 && hareValue <=8;
        boolean smallSlip = hareValue >= 9 && hareValue <=10;

//        if (sleep){}
//        else if (hop){}
//        else if (bigSlip){}
//        else if (smallHop){}
//        else if (smallSlip){}
        return movement;
    }

    public static int validateTortoiseInput(){
        int movement =0;
        int tortoiseValue = generateRandomForTortoise();
        boolean fastPlod = tortoiseValue >= 1 && tortoiseValue<= 5;
        boolean slip = tortoiseValue >= 6 && tortoiseValue<= 7;
        boolean plod = tortoiseValue >= 8 && tortoiseValue<= 10;
        if (fastPlod){
            movement += 3;
        }
        if (slip){
            movement -= 6;
        }
        if (plod){
            movement +=1;
        }
        return movement;
    }

    private static int[][] declareGameField(){
        return new int[10][10];
    }

    public static void displayGameField(){
        int [] [] gameField = declareGameField();
            for (int column : gameField[9] ){
                System.out.println(Arrays.toString(gameField[column]));
            }
            System.out.println();
        }
    }