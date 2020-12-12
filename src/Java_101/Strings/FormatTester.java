package Java_101.Strings;

public class FormatTester {

    public static void main(String[] args) {
        final String t = String.format("The correct answer is %b", false);
        System.out.println(t);

        final String w = "Insert Name Here";
        final String s = String.format("The correct answer is %s", w);
        System.out.println(s);

    }
}
