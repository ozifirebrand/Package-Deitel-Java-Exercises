package ClassWork.dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

    java.util.ArrayList<Integer> guy = new java.util.ArrayList<>();
    List myArrayList;
    @BeforeEach

    public void setUp(){
        myArrayList = new ArrayList();

    }
    @Test
    public void arrayListCanBeCreated(){
        //this is because I want to use my own lists and not Java's list
        //we edited the ArrayList name from AnArrayList
        assertNotNull(myArrayList);
    }

    @Test
    public void arrayListIsEmpty(){
        //this is because I want to use my own lists and not Java's list
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void testThatArrayListShouldNotBeEmpty(){
        myArrayList.add(34);
        assertFalse(myArrayList.isEmpty());
    }

    @Test
    public void testThatArrayListIsEmptyWhenIAddAndRemoveAnElement(){
        myArrayList.add(54);
        myArrayList.remove(54);
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void testThatArrayListIsEmptyWhenIAddElementsAndRemoveAnElement(){
        myArrayList.add(54);
        myArrayList.add(4);
        myArrayList.add(36);
        myArrayList.remove(54);
        assertFalse(myArrayList.isEmpty());
    }

    @Test
    public void testThatElementCannotBeRemovedIfArrayIsEmpty(){
        assertThrows(IllegalArgumentException.class, ()-> myArrayList.remove(3));
    }

    @Test
    public void testThatListSizeIncreases(){
        myArrayList.add(4);
        assertEquals(1, myArrayList.getSize());
    }

    @Test
    public void testThatElementsCanBeReplacedInTheList(){
        myArrayList.add(34);
        myArrayList.add(94, 0);
        assertEquals(94, myArrayList.get(0));
    }

    @Test
    public void testThatElementsCanBeGottenViaIndex(){
        myArrayList.add(34);
        myArrayList.add(94);
        myArrayList.add(56);
        assertEquals(56, myArrayList.get(2));
    }

    @Test
    public void testThatTheArrayExpandsWhenTheCapacityFills(){
        myArrayList.add(34);
        myArrayList.add(94);
        myArrayList.add(56);
        myArrayList.add(60);

        assertEquals(4, myArrayList.getSize());
    }
}