package Generics;

public class OrderedPair<K,V> {

    private final K first;
    private final V second;

    public OrderedPair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public static <K, V> boolean equivalent(OrderedPair<K, V> p1,
                                            OrderedPair<K, V> p2) {
        return p1.getFirst().equals(p2.getFirst()) &&
                p1.getSecond().equals(p2.getSecond());
    }
}
