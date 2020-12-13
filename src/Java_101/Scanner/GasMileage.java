package Java_101.Scanner;

import java.util.Scanner;

public class GasMileage {

    public static void main(String[] args) {

        System.out.print("Enter the number of miles: ");
        final Scanner scan = new Scanner(System.in);
        final int miles = scan.nextInt();

        System.out.print("Enter the gallons of fuel used: ");
        final double gallons = scan.nextDouble();

        final double mpg = miles / gallons;
        System.out.println("Miles Per Gallon: " + mpg);

        scan.close();
    }
}
