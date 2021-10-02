package chapter10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardValidationTest {


    @Test
    @DisplayName("Test that numbers cannot be lesser than 13")
    public void testLengthOfNumbersInCardNotLesserThan13(){
        //given
        CardValidation card = new CardValidation("4537802395732");
        //when
        //assert
        assertEquals(13, card.getSize());
    }

    @Test
    @DisplayName("Test that numbers can be summed at even place from the back")
    public void testNumbersCanSumAtEvenPlace(){
        //given
        CardValidation cardValidation = new CardValidation();
        //when
        cardValidation.sumEvenPlacedNumbersFromBehind("3452164");
        //

    }

}