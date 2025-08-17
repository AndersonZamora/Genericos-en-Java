package com.cincout.proyecto;

import java.util.Objects;

public class Utility {

    public static <T> void printItem(T value) {
        System.out.println(value);
    }

    public static <T, K> void printItem(T value, K key) {
        System.out.println(value + " " + key);
    }

    public static <T> void printItem(Iterable<T> value) {
        for (T o : value) {
            System.out.println(o);
        }
    }
}
