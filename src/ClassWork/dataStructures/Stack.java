package ClassWork.dataStructures;

public class Stack {
    private int counter = 0;

    public void push(int value) {
        counter++;
    }

    public int size() {
        return counter;
    }

    public void pop() {
        if ( isEmpty() ) throw new UnderFlowException("message lo ku bayii");
        counter--;
    }

    public boolean isEmpty() {
        if ( counter ==0 ) return true;
        return false;
    }


    public static class UnderFlowException extends RuntimeException{
        public UnderFlowException (String message){
            super(message);
        }
    }
}
