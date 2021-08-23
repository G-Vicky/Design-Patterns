package com.vicky;

import com.vicky.iterator.BrowerHistory;
import com.vicky.iterator.Iterator;

public class Main {

    public static void main(String[] args) {
        BrowerHistory history = new BrowerHistory();
        history.push("url1");
        history.push("url2");
        history.push("url3");
        Iterator iterator = history.createIterator();
        while (!iterator.isDone()) {
            System.out.println(iterator.current());
            iterator.next();
        }
     }

}
