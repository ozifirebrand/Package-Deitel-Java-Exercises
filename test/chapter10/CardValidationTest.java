package chapter10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardValidationTest {

    @Test
    @DisplayName("Test that numbers cannot be lesser than 13")
    public void testLengthOfNumbersInCardNotLesserThan13(){
        //given
        //when
        //assert
        assertThrows(IllegalArgumentException.class, ()-> new CardValidation("453780239532"));
    }

    @Test
    @DisplayName("Test that numbers cannot be greater than 16")
    public void testLengthOfNumbersInCardNotGreaterThan16(){
        //given
        //when
        //assert
        assertThrows(IllegalArgumentException.class, ()-> new CardValidation("45378023957329425"));
    }

    @Test
    @DisplayName("Test that numbers can be summed at even place from the back")
    public void testNumbersCanSumAtEvenPlace(){
        //given
        CardValidation cardValidation = new CardValidation("4537802395732425");
        //when
        cardValidation.sumOfDoubleEvenNumber("4537802395732425");
        assertEquals(33, cardValidation.getDoubleEvenNumberSum());
    }

    @Test
    @DisplayName("Test that numbers can be summed at even place from the back")
    public void testNumbersCanSumAtEvenPlaceFor13Digits(){
        //given
        CardValidation cardValidation = new CardValidation("4537802392425");
        //when
        cardValidation.sumOfDoubleEvenNumber("4537802392425");
        assertEquals(19, cardValidation.getDoubleEvenNumberSum());
    }

}