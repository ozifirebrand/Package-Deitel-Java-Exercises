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
    @DisplayName("Test that numbers can be summed at odd` place from the back")
    public void testNumbersCanSumAtEvenPlace(){
        //given
        CardValidation cardValidation = new CardValidation("4537802395732425");
        //when
        cardValidation.sumOddPlace("4537802395732425");
        assertEquals(32, cardValidation.getOddPlaceNumberSum());
    }

    @Test
    @DisplayName("Test that numbers can be summed at odd place from the back for 13 digits")
    public void testNumbersCanSumAtEvenPlaceFor13Digits(){
        //given
        CardValidation cardValidation = new CardValidation("4537802392425");
        //when
        cardValidation.sumOddPlace("4537802392425");
        assertEquals(31, cardValidation.getOddPlaceNumberSum());
    }

    @Test
    @DisplayName("Test that numbers can be doubled at even place from the back")
    public void testMultiplicationOfNumbersBy2(){
        //given
        CardValidation cardValidation = new CardValidation("4537802392425");
        //when
        cardValidation.sumOfDoubleEvenPlacedNumbers("4537802392425");
        assertEquals(38, cardValidation.getDoubleEvenPlaceNumberSum());
    }

    @Test
    @DisplayName("Test that if digit is greater than 9, the individual digits are added")
    public void testDigitsGreaterThan9AreSummed(){
        //given
        CardValidation cardValidation = new CardValidation("4537802392425");
        //when
        //assert
        assertEquals(9, cardValidation.getDigit(18));
    }

    @Test
    @DisplayName("Test that prefix matches condition for visa card")
    public void testPrefixMatchRequirementForVisaCard(){
        //given
        CardValidation cardValidation = new CardValidation("4537802392425");
        //when
        //assert
        assertTrue(cardValidation.prefixMatched("4537802392425", 45));
    }

    @Test
    @DisplayName("Test that prefix matches condition for visa card")
    public void testPrefixMatchRequirementForMasterCard(){
        //given
        CardValidation cardValidation = new CardValidation("4537802392425");
        //when
        //assert
        assertTrue(cardValidation.prefixMatched("4537802392425", 4));
    }

    @Test
    @DisplayName("Test that card number is valid")
    public void testNumberIsValid(){
        //given
        CardValidation cardValidation = new CardValidation("4537802392425");
        //when
        //assert
        assertTrue(cardValidation.isValid("4537802392426"));
    }
}