package com.pluralsight;

import java.util.*;

public class FixedList<T> {
    private List<T> items;
    private int maxSize;

    public FixedList(int maxSize) {
        this.items = new ArrayList<>();
        this.maxSize = maxSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void add(T item){
        if (items.size() < maxSize){
            items.add(item);
        }
        else {
            throw new IllegalStateException();
        }
    }

    public List<T> getItems(){
        return items;
    }

    @Override
    public String toString() {
        return "FixedList{" +
                "items=" + items +
                ", maxSize=" + maxSize +
                '}';
    }
}
