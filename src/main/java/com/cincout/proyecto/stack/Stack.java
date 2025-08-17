package com.cincout.proyecto.stack;

import com.cincout.proyecto.Utility;

import java.util.ArrayList;
import java.util.List;
/**
 * Implementación genérica de una estructura de datos tipo Pila (Stack).
 * <p>
 * Esta pila sigue la política LIFO (Last In, First Out):
 * el último elemento insertado es el primero en salir.
 * Internamente utiliza un {@link ArrayList} para almacenar los elementos.
 *
 * @param <T> tipo de los elementos almacenados en la pila
 */
public class Stack <T>{

    /** Lista interna que contiene los elementos de la pila. */
    private final List<T> elements = new ArrayList<>();

    /**
     * Inserta un elemento en la parte superior de la pila.
     *
     * @param element el elemento a agregar
     */
    public void push(T element){
        elements.add(element);
        Utility.printItem("Elemento agregado ..."+ element);
    }

    /**
     * Verifica si la pila está vacía.
     *
     * @return {@code true} si la pila no contiene elementos,
     *         {@code false} en caso contrario
     */
    public boolean isEmpty(){
        return elements.isEmpty();
    }

    /**
     * Retorna el elemento en la parte superior de la pila sin eliminarlo.
     *
     * @return el último elemento agregado a la pila
     * @throws IllegalStateException si la pila está vacía
     */
    public T peek(){
        if(isEmpty()){
            throw  new IllegalStateException("La pila esta vacia");
        }

        return elements.getLast();
    }

    /**
     * Retorna y elimina el elemento en la parte superior de la pila.
     *
     * @return el último elemento agregado a la pila
     * @throws IllegalStateException si la pila está vacía
     */
    public T pop(){
        if(isEmpty()){
            throw  new IllegalStateException("La pila esta vacia");
        }

        return elements.removeLast();
    }

    /**
     * Imprime todos los elementos de la pila en consola.
     * Utiliza {@link Utility#printItem(Object)} para mostrar cada valor.
     * El orden de impresión es del primero al último elemento insertado.
     */
    public void print(){
        Utility.printItem(elements);
    }
}
