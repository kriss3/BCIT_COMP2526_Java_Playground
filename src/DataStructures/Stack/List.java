package DataStructures.Stack;

import java.security.InvalidParameterException;

public class List {
    private ListNode firstNode;
    private ListNode lastNode;
    private String name;

    public List() {
        this("list");
    }

    public List(final String listName) {
        name = listName;
        firstNode = lastNode = null;
    }

    public void insertAtFront(final Object insertItem) {
        if (isEmpty()) {
            firstNode = lastNode = new ListNode(insertItem);
        } else {
            firstNode = new ListNode(insertItem, firstNode);
        }
    }

    public void insertAtBack(final Object insertItem) {
        if (isEmpty()) {
            firstNode = lastNode = new ListNode(insertItem);
        } else {
            lastNode.setNext(new ListNode(insertItem));
            lastNode = lastNode.getNext();
        }
    }

    public Object removeFromFront() throws InvalidParameterException {
        if (isEmpty()) {
            throw new InvalidParameterException(name);
        }
        Object removedItem = firstNode.getObject();

        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            firstNode = firstNode.getNext();
        }
        return removedItem;
    }

    public Object removeFromBack() throws InvalidParameterException {
        if (isEmpty()) {
            throw new InvalidParameterException(name);
        }
        Object removedItem = lastNode.getObject();

        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            ListNode current = firstNode;

            while (current.getNext() != lastNode) {
                current = current.getNext();
            }
            lastNode = current;
            current.setNext(null);
        }
        return removedItem;
    }

    public boolean isEmpty() {
        return firstNode == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s\n", name);
            return;
        }

        System.out.printf("The %s is: ", name);
        ListNode current = firstNode;

        while (current != null) {
            System.out.printf("%s ", current.getObject());
            current = current.getNext();
        }

        System.out.println("\n");
    }



}
