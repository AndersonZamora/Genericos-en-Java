package com.cincout.proyecto.datastore;

import java.util.*;

public class DataStore<T, K> {
    private final List<T> dataList;
    private final Map<K,T>  dataMap;

    public DataStore(){
        this.dataList = new ArrayList<>();
        this.dataMap = new HashMap<>();
    }

    public boolean add(K key, T item) {

        Objects.requireNonNull(key,"La clave no puede ser nulo");
        Objects.requireNonNull(key,"El item no puede ser nulo");

        if(dataMap.containsKey(key)) return false;

        dataList.add(item);
        dataMap.put(key,item);
        return true;
    }

    public T remove(K key){
        Objects.requireNonNull(key,"La clave no puede ser nulo");

        T item = dataMap.remove(key);

        if(item != null){
            dataList.remove(item);
        }

        return item;
    }

    public T find(K key){
        Objects.requireNonNull(key,"La clave no puede ser nulo");

        return dataMap.get(key);
    }

    public List<T> getAll(){
        return Collections.unmodifiableList(dataList);
    }
}
