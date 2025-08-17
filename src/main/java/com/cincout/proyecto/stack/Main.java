package com.cincout.proyecto.stack;

import com.cincout.proyecto.Utility;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(26);

        Stack<String> names = new Stack<>();

        names.push("Anderson");
        names.push("Claudia");

        integerStack.print();

        Utility.printItem("Elemento en la cima " + integerStack.peek());
        Utility.printItem("Eliminar un elemento " + integerStack.pop());

        integerStack.print();
    }
}
