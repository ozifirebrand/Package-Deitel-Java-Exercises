package ClassWork.dataStructures;

public class Stack {
    private int counter = 0;
    private int element;

    public void push(int element) {
        this.element = element;
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
        return counter == 0;
    }

    public int peek(){
        return element;
    }


    public static class UnderFlowException extends RuntimeException{
        public UnderFlowException (String message){
            super(message);
        }
    }
}
