package chapter7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SingingProgramTest {

    @Test
    public void song(){
        SingingProgram program = new SingingProgram();
        program.music(5, "*");
        Assertions.assertEquals("*", program.lyrics());
    }
}