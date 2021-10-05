package ClassWork.dataStructures;

public class ArrayList implements List {
    private boolean isEmpty = true;
    private int size = 0;
    private int element;
    private int [] elements;

    public ArrayList(){
        elements = new int[3];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void add(int element){
        elements[size] = element;
        size += 1;
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



    public void remove(int i){
        if ( isEmpty()) throw new IllegalArgumentException("ArrayList is empty");
            size -= 1;
    }

    public int getSize(){
        return size;
    }


}