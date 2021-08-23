package com.vicky.iterator;

public class ArrayIterator implements Iterator{
    private String[] array;
    private int index;

    public ArrayIterator(String[] array) {
        this.array = array;
        index = 0;
    }

    @Override
    public void next() {
        index++;
    }

    @Override
    public String current() {
        return array[index];
    }

    @Override
    public boolean isDone() {
        return index == array.length-1;
    }
}
