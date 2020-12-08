package Java_101;

import java.text.NumberFormat;

public class DVD {

    private final String title;
    private final String director;
    private final int year;
    private final double cost;
    private final boolean bluRay;

    public DVD(String title,
               String director,
               int year,
               double cost,
               boolean bluRay) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.cost = cost;
        this.bluRay = bluRay;
    }

    public String toString() {
        final NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String description;
        description = fmt.format(cost) + "\t" + year + "\t";
        description += title + "\t" + director;
        if (bluRay) {
            description += "\t" + "Blu-Ray";
        }
        return description;
    }
}
