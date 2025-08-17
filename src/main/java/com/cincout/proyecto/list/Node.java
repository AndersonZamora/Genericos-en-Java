package com.cincout.proyecto.list;

/**
 * Implementación básica de una lista enlazada simple genérica.
 *
 * @param <T> tipo de los elementos que contendrá la lista
 */

/**
 * Clase interna que representa un nodo de la lista.
 * Contiene el dato y la referencia al siguiente nodo.
 */

public class Node<T> {
    T data;
    Node<T> next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }
}
