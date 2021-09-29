package ClassWork;

public class Screen {

    int [][] screen ;
    int row;
    int column;
    public Screen(){

    }

    public int displayScreenValue() {
        return screen[row][column];
    }

    public void setScreen() {
        screen = new int[5][4];
    }
}
