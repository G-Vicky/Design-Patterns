package com.vicky.state;

/**
 * Context(Account): Maintains an instance of a ConcreteState subclass that defines the current state.
 */
public class Canvas {
    private Tool currentTool;

    public Canvas(Tool currentTool) {
        this.currentTool = currentTool;
    }

    public void mouseDown() {
        currentTool.mouseDown();
    }

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
