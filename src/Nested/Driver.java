package Nested;

public class Driver {
    public static void main(String[] args) {
        Parcel parcel = new Parcel();
        final int carefulPacker = 3;
        Wrapping wrapping = parcel.wrapping(carefulPacker);
        System.out.println(wrapping.getNumberOfLayers());
        System.out.println("but");
        //and here I want to place the results of layers() method from the Parcel class;
    }
}
