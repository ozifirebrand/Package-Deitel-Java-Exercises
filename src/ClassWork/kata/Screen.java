package ClassWork.kata;

public class Screen {

    int [][] screen ;
    int numberOfRows;
    int numberOfColumns;

    public Screen( ){
        screen = new int[5][4];
    }
    public int[][] displayScreen() {
        return screen;
    }

    public void setScreen() {
        screen = new int[5][4];
    }
}