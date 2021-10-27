package ClassWork.dataStructures;

public class Stack {
    private int counter = 0;
    private int[] elements;

    public Stack(int capacity) {
        elements = new int[capacity];
    }

    public void push(int element) {
        if ( counter == elements.length ) throw new OverFlowException("Too mush numbers");
        elements[counter++] = element;
    }

    public int size() {
        return counter;
    }

    public int pop() {
        if ( isEmpty() ) throw new UnderFlowException("message lo ku bayii");
        return --counter;
    }

    public boolean isEmpty() {
        return counter == 0;
    }

    public int peek(){
        return elements[--counter];
    }


    public static class UnderFlowException extends RuntimeException{
        public UnderFlowException (String message){
            super(message);
        }
    }

    public static class OverFlowException extends RuntimeException {
        public OverFlowException(String message){
            super(message);
        }
    }
}
//todo implement an email regex and a password regex that contains 8 characters. At least one uppercase character, lowercase character, a number and a number
// todo QUEUE.