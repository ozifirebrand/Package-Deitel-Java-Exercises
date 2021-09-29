package ClassWork.kata;

public class SevSegDisplay {

    int [][] screen;
    public void clear() {
        screen = new int [5][4];
    }

    public int[][] getScreen() {
        return screen;
    }

    public void writeOnA() {
        screen[0][0] = screen[0][1]= screen[0][2]=screen[0][3]=1;
    }

    public void writeOnB() {
        for (int row = 0; row<3; row++){
            screen[row][3] = 1;
        }
    }

    public void writeOnC() {
        for (int row = 2; row< 5; row++){
            screen[row][3] = 1;
        }
    }

    public void writeOnD() {
        for (int column = 0; column < 4; column++) {
            screen[4][column] = 1;
        }
    }

    public void writeOnE() {
        for (int row = 2; row< 5; row++){
            screen[row][0] = 1;
        }
    }

    public void writeOnF() {
        for (int row = 0; row<3; row++){
            screen[row][0] =1 ;
        }
    }

    public void writeOnG() {
        for (int column = 0; column<3; column++){
            screen[2][column] =1 ;
        }
    }

    public void display() {
        for (int [] row: screen){
            for (int column : row) {
                if ( column == 1 ) {
                    System.out.print("# ");
                }
                if ( column == 0 ) {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void setScreen(String numbers){
        if ( numbers.length() > 8 ) throw new IllegalArgumentException("Too large number of inputs");
        for (char number : numbers.toCharArray()){
            if ( number != '1' && number != '0' ) throw new IllegalArgumentException("Inappropriate input.");
        }
        for (int index = 0; index < numbers.length() -1; index++) {
            if ( numbers.charAt(7) != '0' ) {
                if ( numbers.charAt(0) == '1' ) {
                    writeOnA();
                }
                if ( numbers.charAt(1) == '1' ) { writeOnB(); }
                if ( numbers.charAt(2) == '1' ) { writeOnC(); }
                if ( numbers.charAt(3) == '1' ) { writeOnD(); }
                if ( numbers.charAt(4) == '1' ) { writeOnE(); }
                if ( numbers.charAt(5) == '1' ) { writeOnF(); }
                if ( numbers.charAt(6) == '1' ) { writeOnG(); }
            }else { clear();}
        }
}
}

//    Screen screen = new Screen();
//
//    public void takeInNumbers(String numbers){
//        for (int index = 0; index < numbers.length() -1; index++){
//            if ( numbers.charAt(index = 0) == '1' ){
//                printA(screen.displayScreen());
//            }
//        }
//    }
//
//    public void printA(int [] [] screenDisplay){
//        for (int row = 0; row<screenDisplay.length; row++){
//            for (int column = 0; column<screenDisplay.length; column++){
//                if ( row == 0 && (column == 0 || column == 1 || column == 2 || column == 3) ){
//                    screenDisplay[row][column] = 1;
//                }
//            }
//        }
//    }
//
//    public void printB(int [] [] screenDisplay){
//        for (int row = 0; row<screenDisplay.length; row++){
//            for (int column = 0; column<screenDisplay.length; column++){
//                if ( column == 3 && (row == 0 || row == 1 || row == 2) ){
//                    screenDisplay[row][column] = 1;
//                }
//            }
//        }
//    }
//
//    public void printC(int [] [] screenDisplay){
//        for (int row = 0; row<screenDisplay.length; row++){
//            for (int column = 0; column<screenDisplay.length; column++){
//                if ( column == 3 && (row == 2 || row == 3 || row == 4) ){
//                    screenDisplay[row][column] = 1;
//                }
//            }
//        }
//    }
//
//    public void printD(int [] [] screenDisplay){
//        for (int row = 0; row<screenDisplay.length; row++){
//            for (int column = 0; column<screenDisplay.length; column++){
//                if ( row == 4 && (column == 0 || column == 1 || column == 2 || column == 3) ){
//                    screenDisplay[row][column] = 1;
//                }
//            }
//        }
//    }
//
//    public void printE(int [] [] screenDisplay){
//        for (int row = 0; row<screenDisplay.length; row++){
//            for (int column = 0; column<screenDisplay.length; column++){
//                if ( column == 0 && (row == 2 || row == 3 || row == 4) ){
//                    screenDisplay[row][column] = 1;
//                }
//            }
//        }
//    }
//
//    public void printF(int [] [] screenDisplay){
//        for (int row = 0; row<screenDisplay.length; row++){
//            for (int column = 0; column<screenDisplay.length; column++){
//                if ( column == 0 && (row == 0 || row == 1 || row == 2) ){
//                    screenDisplay[row][column] = 1;
//                }
//            }
//        }
//    }
//
//    public void printG(int [] [] screenDisplay){
//        for (int row = 0; row<screenDisplay.length; row++){
//            for (int column = 0; column<screenDisplay.length; column++){
//                if ( row == 2 && (column == 0 || column == 1 || column == 2 || column == 3) ){
//                    screenDisplay[row][column] = 1;
//                }
//            }
//        }
//    }
//}
