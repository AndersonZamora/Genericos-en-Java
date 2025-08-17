package com.cincout.proyecto.queue;

import com.cincout.proyecto.Utility;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Queue<T> {
    private final LinkedList<T> elements = new LinkedList<>();

    public void enqueue(T element) {
        elements.addLast(element);
        Utility.printItem("Elemento agregado " + element);
    }

    public T peet() {
        if (isEmpty()) throw new NoSuchElementException("La cola esta vaca");

        return elements.getFirst();
    }

    public T dequeue() {
        if (isEmpty()) throw new NoSuchElementException("La cola esta vaca");

        return elements.removeFirst();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public void print(){
        Utility.printItem(elements);
    }
}
