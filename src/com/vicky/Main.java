package com.vicky;

import com.vicky.state.BrushTool;
import com.vicky.state.Canvas;
import com.vicky.state.SelectionTool;

public class Main {

    public static void main(String[] args) {
        Canvas canvas = new Canvas(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();

    }

}
