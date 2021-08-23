package com.vicky.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowerHistory{
    private List<String> urls;
    private int index;

    public BrowerHistory() {
        urls = new ArrayList<>();
        index = -1;
    }

    public void push(String state) {
        urls.add(state);
    }

    public String pop() {
        int lastIndex = urls.size() - 1;
        String state = urls.get(lastIndex);
        urls.remove(state);
        return state;
    }

    public Iterator createIterator() {
        return new ListIterator(urls);
    }
}
