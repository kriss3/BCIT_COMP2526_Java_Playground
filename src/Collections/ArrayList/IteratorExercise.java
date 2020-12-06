package Collections.ArrayList;

import java.util.*;

public final class IteratorExercise {
    private static final String[] COLOURS = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN" };
    private static final String[] REMOVE_COLOURS = {"RED", "WHITE", "BLUE" };

    public IteratorExercise() {
        List<String> list = new ArrayList<>();
        List<String> removeList = new ArrayList<>();
        Collections.addAll(list, COLOURS);
        Collections.addAll(removeList, REMOVE_COLOURS);

        System.out.println("ArrayList: ");
        for (String s : list) {
            System.out.printf("%s ", s);
        }

        System.out.println("\n\nArrayList after calling removeColors: ");
        removeColors(list, removeList);
        for (String color : list) {
            System.out.printf("%s ", color);
        }
    }

    private void removeColors(
            final Collection<String> collection1,
            final Collection<String> collection2) {
        Iterator<String> iterator = collection1.iterator();
        while (iterator.hasNext()) {
            if (collection2.contains(iterator.next())) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        new IteratorExercise();
    }
}
