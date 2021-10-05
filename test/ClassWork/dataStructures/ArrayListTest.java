package ClassWork.dataStructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

    @Test
    public void arrayListCanBeCreated(){
        List myArrayList = new ArrayList();
        //this is because I want to use my own lists and not Java's list
        //we edited the ArrayList name from AnArrayList
        assertNotNull(myArrayList);
    }

    @Test
    public void arrayListIsEmpty(){
        List myArrayList = new ArrayList();
        //this is because I want to use my own lists and not Java's list
        assertTrue(myArrayList.isEmpty());
    }
}