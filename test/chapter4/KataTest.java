package chapter4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    public void testFactorial(){
        Kata kata = new Kata();
       int result = kata.findFactorial(10);
       Assertions.assertEquals(151200, result);

    }

}