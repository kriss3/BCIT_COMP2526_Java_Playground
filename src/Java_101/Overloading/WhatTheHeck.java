package Java_101.Overloading;

public final class WhatTheHeck {
    public void test(String s) {
        System.out.println("String");
    }

    public void test(Object o) {
        System.out.println("Object");
    }

    public static void main(String[] args) {
        WhatTheHeck that = new WhatTheHeck();
        that.test(null);
    }
}
