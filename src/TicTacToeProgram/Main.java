package TicTacToeProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToe ticTacToe = new TicTacToe();
        Winner winner = ticTacToe.getWinner();

        while(winner != Winner.WON){
            System.out.println("Enter number");
            int number = scanner.nextInt();

            ticTacToe.play(number);
            System.out.println(ticTacToe.getPlayer());
            ticTacToe.checkWinner();
            winner = ticTacToe.getWinner();
        }
    }
}
