package Java_101;

public class BasicArray {

    private static final int LIMIT = 15;
    private static final int MULTIPLE = 10;
    private static final int CLUNKER = 999;
    private static final int CLUNK_IDX = 5;

    public static void main(String[] args) {
        final int[] list = new int[LIMIT];

        // Initializes the array values
        for (int index = 0; index < LIMIT; index++) {
            list[index] = index * MULTIPLE;
        }

        // Changes one array value
        list[CLUNK_IDX] = CLUNKER;

        // Prints the array values
        for (int value : list) {
            System.out.print(value + "  ");
        }
    }
}
