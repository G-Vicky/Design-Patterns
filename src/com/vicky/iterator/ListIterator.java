package com.vicky.iterator;

import java.util.List;

public class ListIterator<T> implements Iterator<T> {
    private final List<T> list;
    private int index;
    public ListIterator(List<T> list) {
        this.list = list;
        index = 0;
    }

    @Override
    public void next() {
        index++;
    }

    @Override
    public T current() {
        return list.get(index);
    }

    @Override
    public boolean hasNext() {
        return index == list.size();
    }
}
