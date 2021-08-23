package com.vicky.iterator;

public class ArrayIterator<T> implements Iterator<T>{
    private T[] array;
    private int index;

    public ArrayIterator(T[] array) {
        this.array = array;
        index = 0;
    }

    @Override
    public void next() {
        index++;
    }

    @Override
    public T current() {
        return array[index];
    }

    @Override
    public boolean hasNext() {
        return index == array.length-1;
    }
}
