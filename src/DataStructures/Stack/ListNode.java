package DataStructures.Stack;

public class ListNode {
    private Object data;
    private ListNode nextNode;

    ListNode(final Object object) {
        this(object, null);
    }

    ListNode(final Object object, final ListNode node) {
        data = object;
        nextNode = node;
    }

    public Object getObject() {
        return data;
    }

    public ListNode getNext() {
        return nextNode;
    }

    public void setNext(final ListNode newNext) {
        nextNode = newNext;
    }


}
