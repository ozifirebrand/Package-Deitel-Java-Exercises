package ClassWork.dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    Stack stack;
    @BeforeEach
    public void setStack(){
        stack = new Stack();
    }
    @Test
    public void stackCanBeCreatedTest(){
        assertNotNull(stack);
    }

    @Test
    public void testStackCanAdd(){
        stack.push(34);
        assertEquals(1, stack.size());
    }

    @Test
    public void testCanAddValuesToGetSize2(){
        stack.push(5);
        stack.push(6);
        assertEquals(2, stack.size());
    }

    @Test
    public void testCanRemoveValueAfterAddingValue(){
        stack.push(33);
        stack.pop();
        assertEquals(0, stack.size());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testRemoveFromEmptyStackThrowsAnException(){
        assertTrue(stack.isEmpty());
        assertThrows(Stack.UnderFlowException.class, ()-> stack.pop());
    }

}