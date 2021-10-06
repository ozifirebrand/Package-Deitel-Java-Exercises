package ClassWork.dataStructures;

import java.util.Arrays;

public class ArrayList implements List {
    private int size = 0;
    private int [] elements;
    private int capacity = 3;

    public ArrayList(){
        elements = new int[3];

    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void add(int element){
        setCapacity();
        elements[size] = element;
        size += 1;
    }

    private void setCapacity() {
        if ( size == capacity-1 ){
            int [] newArray = new int[capacity * 2];
            for (int index = 0; index < elements.length; index++) newArray[index] = elements[index];
            elements = newArray;
            capacity*=2;
        }
    }

    public void add(int element, int index){
        elements[index] = element;
    }

    public int get(int i){
        return elements[i];
    }

    public int getCapacity(){
        return elements.length;
    }
    public int getIndexOf(int element){
        int index;
        for (index = 0; index < size; index++){
            if ( elements[index] == element ) return index;
        }
        return index;
    }

    public void remove(int element){
        if ( isEmpty()) throw new IllegalArgumentException("ArrayList is empty");
        //find value in position
        // overwrite it with values in the right
        for (int index = getIndexOf(element); index<size; index++){
                elements[index] = elements[index+1];
        }
        size -= 1;
    }

    public int getSize(){
        return size;
    }
    @Override
    public String toString(){
        return Arrays.toString(elements);
    }
}