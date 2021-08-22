package com.vicky.memento;

/**
 * Caretaker: Holds an ArrayList that contains all previous versions of the Memento. It can store and retrieve stored Mementos.
 */


import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> states;

    public History() {
        states = new ArrayList<>();
    }

    public void push(EditorState state) {
        states.add(state);
    }

    public EditorState pop() {
        int lastIndex = states.size() - 1;
        EditorState state = states.get(lastIndex);
        states.remove(state);
        return state;
    }
}
