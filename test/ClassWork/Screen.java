package ClassWork;

public class Screen {

    int [][] screen ;
    int numberOfRows;
    int numberOfColumns;

    public Screen( int [][] screen){
        this.screen = screen;
    }
    public int[][] displayScreen() {
        return screen;
    }

    public void setScreen() {
        screen = new int[5][4];
    }
}