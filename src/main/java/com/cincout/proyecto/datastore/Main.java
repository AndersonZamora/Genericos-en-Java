package com.cincout.proyecto.datastore;

import com.cincout.proyecto.Utility;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        DataStore<User, String> userStore = new DataStore<>();

        try {
            Utility.printItem("Agregando usuarios");
            userStore.add("123", new User("123", "Anderson"));
            userStore.add("452", new User("452", "Flor"));
            userStore.add("533", new User("533", "Maria"));

            userStore.find("533");

            Utility.printItem("Encontrado",userStore.find("533"));
            Utility.printItem("Eliminado",userStore.find("533"));
        } catch (NullPointerException e) {
            Utility.printItem(e.getMessage());
        }

        List<User> user = userStore.getAll();
        Utility.printItem(user);
    }
}
