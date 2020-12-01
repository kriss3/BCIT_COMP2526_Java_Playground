package Nested;

class Wrapping {
    private final int layers;
    public Wrapping (final int layers) {
        this.layers = layers;
    }

    public int getNumberOfLayers() {
        return layers;
    }
}

public class Parcel {
    public Wrapping wrapping(final int layers) {
        return new Wrapping(layers) {
            public int layers() { //why is this method here? how to utilize this int the calling code?
                return super.getNumberOfLayers() * 2;
            }
        };
    }
}
