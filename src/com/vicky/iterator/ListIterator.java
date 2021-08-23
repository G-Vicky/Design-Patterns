package com.vicky.iterator;

import java.util.List;

public class ListIterator implements Iterator {
    private List<String> list;
    private int index;
    public ListIterator(List list) {
        this.list = list;
        index = 0;
    }

    @Override
    public void next() {
        index++;
    }

    @Override
    public String current() {
        return list.get(index);
    }

    @Override
    public boolean isDone() {
        return index == list.size();
    }
}
