package com.vicky.memento;

/**
 * Memento: The basic object that is stored in different states.
 */

public class EditorState {
    private final String state;

    public EditorState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
