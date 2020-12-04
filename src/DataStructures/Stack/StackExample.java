package DataStructures.Stack;

import java.security.InvalidParameterException;

public class StackExample {

    private List stackList;

    public StackExample() {
        stackList = new List("KWS Stack");
    }

    public void push(final Object object) {
        stackList.insertAtFront(object);
    }

    public Object pop() throws InvalidParameterException {
        return stackList.removeFromFront();
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public void print() {
        stackList.print();
    }
}
