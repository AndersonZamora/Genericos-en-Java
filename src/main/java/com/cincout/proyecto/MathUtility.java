package com.cincout.proyecto;

public class MathUtility {

    public static <T extends  Number> double sum(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }
}
