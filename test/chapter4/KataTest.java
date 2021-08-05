package chapter4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
public void testPriceForLessThan5(){
        Kata kata = new Kata();
        int totalPriceOfPqs = kata.getPrice(2);
        Assertions.assertEquals(3000, totalPriceOfPqs);

    }

    @Test
    public void testPriceForLessThan10One(){
        Kata kata = new Kata();
        int totalPriceOfPqs = kata.getPrice(5);
        Assertions.assertEquals(7000, totalPriceOfPqs);

    }
    @Test
    public void testPriceForLessThan10(){
        Kata kata = new Kata();
        int totalPriceOfPqs = kata.getPrice(9);
        Assertions.assertEquals(12600, totalPriceOfPqs);

    }

    @Test
    public void testPriceForLessThan30(){
        Kata kata = new Kata();
        int totalPriceOfPqs = kata.getPrice(29);
        Assertions.assertEquals(34800, totalPriceOfPqs);

    }

    @Test
    public void testPriceForLessThan50(){
        Kata kata = new Kata();
        int totalPriceOfPqs = kata.getPrice(49);
        Assertions.assertEquals(53900, totalPriceOfPqs);

    }

    @Test
    public void testPriceForLessThan100(){
        Kata kata = new Kata();
        int totalPriceOfPqs = kata.getPrice(99);
        Assertions.assertEquals(99000, totalPriceOfPqs);

    }

    @Test
    public void testPriceForLessThan200(){
        Kata kata = new Kata();
        int totalPriceOfPqs = kata.getPrice(199);
        Assertions.assertEquals(179100, totalPriceOfPqs);

    }

    @Test
    public void testPriceForGreaterThan200(){
        Kata kata = new Kata();
        int totalPriceOfPqs = kata.getPrice(2000);
        Assertions.assertEquals(1600000, totalPriceOfPqs);

    }
//    public void testFactorial(){
//        Kata kata = new Kata();
//       int result = kata.findFactorial(10);
//       Assertions.assertEquals(151200, result);
//
//    }

}