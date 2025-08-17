package com.cincout.proyecto.datastore;

public class User {
    private String id;
    private String string;

    public User(String id, String string) {
        this.id = id;
        this.string = string;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", string='" + string + '\'' +
                '}';
    }
}
