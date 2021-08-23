package com.vicky;

import com.vicky.iterator.BrowerHistory;
import com.vicky.iterator.Iterator;

public class Main {

    public static void main(String[] args) {
        BrowerHistory<String> history = new BrowerHistory<>();
        history.push("url1");
        history.push("url2");
        history.push("url3");
        Iterator<String> iterator = history.createIterator();
        while (!iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
     }

}
