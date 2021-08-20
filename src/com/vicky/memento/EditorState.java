package com.vicky.memento;

public class EditorState {
    private final String state;

    public EditorState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
