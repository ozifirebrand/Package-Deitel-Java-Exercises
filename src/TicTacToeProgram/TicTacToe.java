package TicTacToeProgram;

public class TicTacToe {
    private Board [][] board = new Board[3][3];

    public Board[][] getBoard() {
        return board;
    }

    public CellValue getCellValue() {
        return CellValue.EMPTY;
    }
}