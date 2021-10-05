package ClassWork.ticTacToe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    @Test
    public void testThat3By3ArrayWasCreated(){
        //given
        TicTacToe ticTacToe = new TicTacToe();
        //when
        //assert
        for (int[] row : ticTacToe.getBoard()){
            for (int column : row){
                assertEquals(0, column);
            }
        }
    }
    @Test

    public void testThatBoardIsEmptyOnCreation(){
        //given that
        TicTacToe ticTacToe = new TicTacToe();
        //when
        //assert
        assertEquals(CellValue.EMPTY, ticTacToe.getCellValue());
    }

    @Test

    public void testThatWeCanSetTheValueXOnTheBoard(){
        //given
        TicTacToe ticTacToe = new TicTacToe();
        //when
        ticTacToe.setCellValue(CellValue.X);
        //assert
        assertEquals(CellValue.X,ticTacToe.getCellValue());
    }
    @Test

    public void testThatWeCanSetTheValueOfOOnTheBoard(){
        //given
        TicTacToe ticTacToe = new TicTacToe();
        //when
        ticTacToe.setCellValue(CellValue.O);
        //assert
        assertEquals(CellValue.O,ticTacToe.getCellValue());
    }

    @Test

    public void arrayIsCreated(){
        //given
        TicTacToe ticTacToe = new TicTacToe();
        //when
//        int [][] array = ticTacToe.getArray();
        //assert
        assertEquals(0, ticTacToe.getArray()[0][0]);


    }



}