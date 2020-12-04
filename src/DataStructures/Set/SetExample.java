package DataStructures.Set;

import java.util.*;

public class SetExample {

    private static final String[] COLOURS =
            {"red", "white", "blue", "green", "gray", "orange",
                    "tan", "white", "cyan", "peach", "gray", "orange" };

    public SetExample() {
        List<String> list = Arrays.asList(COLOURS);
        System.out.printf("ArrayList: %s%n", list);
        printNonDuplicates(list);
    }

    private void printNonDuplicates(final Collection<String> collection) {
        Set<String> set = new HashSet<>(collection);
        System.out.println("\nNon-duplicates are: ");
        for (String s : set) {
            System.out.printf("%s ", s);
        }
        System.out.println();
    }

    public static void main(final String[] args) {
        new SetExample();
    }
}
