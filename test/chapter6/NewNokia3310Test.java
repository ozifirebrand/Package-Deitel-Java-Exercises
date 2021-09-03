package chapter6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewNokia3310Test {

    @Test
    public void testThatMenuCanDisplay(){
        //given
        NewNokia3310.displayPhonebookMenu();
    }

}