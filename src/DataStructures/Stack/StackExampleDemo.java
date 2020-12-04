package DataStructures.Stack;

import java.security.InvalidParameterException;

public final class StackExampleDemo {

    private StackExampleDemo() {}

    public static void main(String[] args) {
        StackExample stack = new StackExample();
        stack.push(-1);
        stack.print();
        stack.push(0);
        stack.print();
        stack.push(1);
        stack.print();
        stack.push(5);
        stack.print();

        try {
            while (true) {
                Object removedObject = stack.pop();
                System.out.printf("%s popped%n", removedObject);
                stack.print();
            }
        } catch (InvalidParameterException emptyListException) {
            emptyListException.printStackTrace();
        }

    }

}
