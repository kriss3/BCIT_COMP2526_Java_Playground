package DataStructures.LinkedListDemo;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    private static final String[] COLOURS =
            {"black", "yellow", "green", "blue", "violet", "silver"};
    private static final String[] MORE_COLOURS =
            {"gold", "white", "brown", "blue", "gray", "silver"};

    public ListDemo() {
        List<String> list1 = new LinkedList<>();
        List<String> list2 = new LinkedList<>();

        for (String color : COLOURS) {
            list1.add(color);
        }
        for (String color : MORE_COLOURS) {
            list2.add(color);
        }

        list1.addAll(list2);
        printList(list1);
        convertToUppercaseStrings(list1);
        printList(list1);

        System.out.print("\nDeleting elements 4 to 6...");
        removeItems(list1, 4, 7);
        printList(list1);
        printReversedList(list1);

    } // end ctor

    public void printList(final List<String> list) {
        System.out.println("\nlist: ");

        for (String color : list) {
            System.out.printf("%s ", color);
        }

        System.out.println();
    }

    private void convertToUppercaseStrings(final List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }

    private void removeItems(final List<String> list, final int start, final int end) {
        list.subList(start, end).clear();
    }

    private void printReversedList(final List<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());
        System.out.println("\nReversed List:");
        while (iterator.hasPrevious()) {
            System.out.printf("%s ", iterator.previous());
        }
    }


    public static void main(String[] args) {
        new ListDemo();
    }
}
