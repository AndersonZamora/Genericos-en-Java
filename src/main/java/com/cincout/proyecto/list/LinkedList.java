package com.cincout.proyecto.list;

import java.util.Objects;

public class LinkedList<T> {

    /**
     * Nodo inicial (cabeza) de la lista. Si es null, la lista está vacía.
     */
    private Node<T> head;

    /**
     * Agrega un nuevo elemento al final de la lista.
     *
     * @param data el valor que se desea agregar
     */
    public void add(T data) {
        Node<T> nextNode = new Node<>(data);
        if (head == null) {
            head = nextNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = nextNode;
        }
    }

    /**
     * Recorre la lista e imprime cada elemento en consola.
     * Formato: "Item: valor"
     */
    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.println("Item: " + current.data);
            current = current.next;
        }
    }

    /**
     * Busca el primer nodo que contenga {@code oldData} y lo reemplaza por {@code newData}.
     *
     * @param oldData el valor actual que se desea modificar
     * @param newData el nuevo valor que reemplazará a oldData
     */
    public void update(T oldData, T newData) {
        Node<T> current = head;
        while (current != null) {
//            if(current.data.equals(oldData)){
            if (Objects.equals(current.data, oldData)) { //para evitar NPE
                current.data = newData;
                return; // Solo actualiza la primera coincidencia
            }
            current = current.next;
        }
    }

    /**
     * Elimina la primera ocurrencia de {@code data} en la lista.
     * Si el valor no existe, no se realiza ninguna acción.
     *
     * @param data el valor que se desea eliminar
     */
    public void delete(T data) {
        if (head == null) return;

        //if(head.data.equals(data)){
        if (Objects.equals(head.data, data)) {
            head = head.next;
            return;
        }

        Node<T> current = head.next;
        Node<T> previous = head;

        //while (current != null && !current.data.equals(data)){
        while (current != null && !Objects.equals(current.data, data)) {
            previous = current;
            current = current.next;
        }
        if (current == null) {
            return;
        }

        previous.next = current.next;
    }
}
