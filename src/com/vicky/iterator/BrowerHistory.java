package com.vicky.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowerHistory<T>{
    private final List<T> urls;

    public BrowerHistory() {
        urls = new ArrayList<>();
    }

    public void push(T url) {
        urls.add(url);
    }

    public T pop() {
        int lastIndex = urls.size() - 1;
        T url = urls.get(lastIndex);
        urls.remove(url);
        return url;
    }

    public Iterator<T> createIterator() {
        return new ListIterator<T>(urls);
    }
}
