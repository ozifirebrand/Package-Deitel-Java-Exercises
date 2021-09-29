package ClassWork;

public class SevSegDisplay {
    public void printA(int [] [] screenDisplay){
        for (int row = 0; row<screenDisplay.length; row++){
            for (int column = 0; column<screenDisplay.length; column++){
                if ( row == 0 && (column == 0 || column == 1 || column == 2 || column == 3) ){
                    screenDisplay[row][column] = 1;
                }
            }
        }
    }

    public void printB(int [] [] screenDisplay){
        for (int row = 0; row<screenDisplay.length; row++){
            for (int column = 0; column<screenDisplay.length; column++){
                if ( column == 3 && (row == 0 || row == 1 || row == 2) ){
                    screenDisplay[row][column] = 1;
                }
            }
        }
    }

    public void printC(int [] [] screenDisplay){
        for (int row = 0; row<screenDisplay.length; row++){
            for (int column = 0; column<screenDisplay.length; column++){
                if ( column == 3 && (row == 2 || row == 3 || row == 4) ){
                    screenDisplay[row][column] = 1;
                }
            }
        }
    }

    public void printD(int [] [] screenDisplay){
        for (int row = 0; row<screenDisplay.length; row++){
            for (int column = 0; column<screenDisplay.length; column++){
                if ( row == 4 && (column == 0 || column == 1 || column == 2 || column == 3) ){
                    screenDisplay[row][column] = 1;
                }
            }
        }
    }

    public void printE(int [] [] screenDisplay){
        for (int row = 0; row<screenDisplay.length; row++){
            for (int column = 0; column<screenDisplay.length; column++){
                if ( column == 0 && (row == 2 || row == 3 || row == 4) ){
                    screenDisplay[row][column] = 1;
                }
            }
        }
    }

    public void printF(int [] [] screenDisplay){
        for (int row = 0; row<screenDisplay.length; row++){
            for (int column = 0; column<screenDisplay.length; column++){
                if ( column == 0 && (row == 0 || row == 1 || row == 2) ){
                    screenDisplay[row][column] = 1;
                }
            }
        }
    }

    public void printG(int [] [] screenDisplay){
        for (int row = 0; row<screenDisplay.length; row++){
            for (int column = 0; column<screenDisplay.length; column++){
                if ( row == 2 && (column == 0 || column == 1 || column == 2 || column == 3) ){
                    screenDisplay[row][column] = 1;
                }
            }
        }
    }
}
