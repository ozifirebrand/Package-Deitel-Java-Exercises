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
    public void testThatIndexCanBeGottenByElement(){
        myArrayList.add(34);
        myArrayList.add(24);
        myArrayList.add(3);
        assertEquals( 1, myArrayList.getIndexOf(24));
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
        myArrayList.add(24);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(94);
        myArrayList.add(56);
        myArrayList.add(60);
        myArrayList.add(90);
        myArrayList.add(77);
        myArrayList.add(9);
        myArrayList.add(6);
        myArrayList.add(87);
        myArrayList.add(589);
        myArrayList.add(51);
        myArrayList.add(999);
        myArrayList.add(2);

        assertEquals(24, myArrayList.getCapacity());
        assertEquals(16, myArrayList.getSize());
    }

    @Test
    public void testThatWhenAnElementIsRemovedTheIndexOfOtherElementsChange(){
        myArrayList.add(6);
        myArrayList.add(87);
        myArrayList.add(589);
        myArrayList.add(58);
        myArrayList.add(8);
        myArrayList.add(90);
        myArrayList.add(909);
        myArrayList.add(900);
        myArrayList.add(91);
        myArrayList.add(70);
        myArrayList.add(75);
        myArrayList.add(77);
        System.out.println(myArrayList);
        myArrayList.remove(8);
        myArrayList.remove(87);
        assertEquals(6, myArrayList.get(0));
        assertEquals(589, myArrayList.get(1));
        assertEquals(58, myArrayList.get(2));
        assertEquals(90, myArrayList.get(3));
        assertEquals(909, myArrayList.get(4));
        assertEquals(900, myArrayList.get(5));
        assertEquals(91, myArrayList.get(6));
        assertEquals(70, myArrayList.get(7));
    }
}