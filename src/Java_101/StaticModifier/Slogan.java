package Java_101.StaticModifier;

public class Slogan {

    /* Holds number of Slogan objects created. */
    private static int count;

    /* Holds slogan. */
    private final String phrase;

    /**
     * Constructs the slogan and counts the number of instances created.
     * @param str the String used for the slogan
     */
    public Slogan(final String str) {
        phrase = str;
        count++;
    }

    /**
     * Returns the number of instances of this class that have been
     * created.
     * @return count as an int
     */
    public static int getCount() {
        return count;
    }

    /**
     * Returns this Slogan as a String.
     * @return toString description
     */
    @Override
    public String toString() {

        return "Slogan{" + "phrase='" + phrase + '\'' + '}';
    }
}
