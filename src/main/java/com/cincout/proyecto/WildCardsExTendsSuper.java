package com.cincout.proyecto;

import java.util.ArrayList;
import java.util.List;

public class WildCardsExTendsSuper {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Anderson");
        names.add("Flor");
        names.add("Maria");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(18);
        numbers.add(2);
        numbers.add(26);

        printList(names);
        printList(numbers);
        sumNumbers(numbers);
        addNumbers(numbers);
    }

    public static void printList(List<?> list){
        for (Object o: list){
            Utility.printItem(o);
        }
    }

    public static void  sumNumbers(List<? extends Number> numbers){
        double sum = 0;

        for (Number num:  numbers){
            sum += num.doubleValue();
        }

        Utility.printItem(sum);
    }

    public static void  addNumbers(List<? super Integer> numbers){
        numbers.add(3);
        numbers.add(5);

        Object num = numbers.get(0);

        Utility.printItem(num);
    }
}
