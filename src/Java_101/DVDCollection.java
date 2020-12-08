package Java_101;

import java.text.NumberFormat;

public class DVDCollection {

    public static final int DEFAULT_SIZE = 100;

    private DVD[] collection;
    private int count;
    private double totalCost;

    public DVDCollection() {
        collection = new DVD[DEFAULT_SIZE];
        count = 0;
        totalCost = 0.0;
    }

    public void addDVD(String title,
                       String director,
                       int year,
                       double cost,
                       boolean bluRay) {
        if (count == collection.length) {
            increaseSize();
        }
        collection[count] = new DVD(title, director, year, cost, bluRay);
        totalCost += cost;
        count++;
    }

    public void addDVD(DVD dvd) {
        if (count == collection.length) {
            increaseSize();
        }
        collection[count] = dvd;
        count++;
    }

    public String toString() {
        final NumberFormat fmt = NumberFormat.getCurrencyInstance();

        String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
        report += "My DVD Collection\n\n";

        report += "Number of DVDs: " + count + "\n";
        report += "Total cost: " + fmt.format(totalCost) + "\n";
        report += "Average cost: " + fmt.format(totalCost / count);

        report += "\n\nDVD List:\n\n";

        for (int dvd = 0; dvd < count; dvd++) {
            report += collection[dvd].toString() + "\n";
        }
        return report;
    }

    private void increaseSize() {
        final DVD[] temp = new DVD[collection.length * 2];

        for (int dvd = 0; dvd < collection.length; dvd++) {
            temp[dvd] = collection[dvd];
        }

        collection = temp;
    }










}
