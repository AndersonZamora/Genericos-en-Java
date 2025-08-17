package com.cincout.proyecto.queue;

import com.cincout.proyecto.Utility;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> numbers = new Queue<>();

        numbers.enqueue(10);
        numbers.enqueue(15);
        numbers.enqueue(18);

        numbers.print();

        Utility.printItem("Ver primero de la fila", numbers.peet());
        Utility.printItem("Eliminar primero de la fila", numbers.dequeue());

        numbers.print();

        Queue<String> names = new Queue<>();
        names.enqueue("Anderson");
        names.enqueue("Tania");

        names.print();
    }
}
