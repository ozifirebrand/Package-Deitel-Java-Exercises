package ClassWork.ticTacToe;

public class TicTacToe {

    private int[][] board = new int[3][3];
    private CellValue cellValue = CellValue.EMPTY;




    public int[][] getBoard() {
        return board;
    }


    public CellValue getCellValue() {
        return cellValue;
    }

    public void setCellValue(CellValue cellValue) {
        System.out.println(this.cellValue);
        this.cellValue=cellValue;
        System.out.println(this.cellValue);
    }

    public int[][] getArray() {
        return this.board;
    }
}
