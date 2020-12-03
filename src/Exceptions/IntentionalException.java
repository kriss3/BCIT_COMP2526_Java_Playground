package Exceptions;

public final class IntentionalException {

    private IntentionalException() {

    }

    /**
     * Deliberately divides by zero to produce an exception.
     */
    public static void main(final String[] args) {
        final int numerator = 10;
        final int denominator = 0;

        System.out.println(numerator / denominator);

        System.out.println("This text will not be printed.");
    }
}
