package Collections.ArrayList;

import java.util.ArrayList;

public final class Beatles {

    public Beatles() {}

    public static void main(String[] args) {
        final ArrayList<String> band = new ArrayList<>();

        band.add("Paul");
        band.add("Pete");
        band.add("John");
        band.add("George");

        System.out.println(band);
        band.remove("Pete");

        System.out.println(band);
        System.out.println("At index 1: " + band.get(1));
        band.add(2, "Ringo");

        System.out.println("Size of the band: " + band.size());

        int idx = 0;

        while (idx < band.size()){
            System.out.println(band.get(idx));
            idx++;
        }
    }
}
