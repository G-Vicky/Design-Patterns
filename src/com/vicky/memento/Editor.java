package com.vicky.memento;

/**
 * Originator: Sets and Gets values from the currently targeted Memento. Creates new Mementos and assigns current values to them.
 */

public class Editor {
    private String content;

    public EditorState createState() {
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        this.content = state.getState();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
