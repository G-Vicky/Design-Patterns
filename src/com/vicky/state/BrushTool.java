package com.vicky.state;

/**
 * Concrete State: Each subclass implements a behavior associated with a state of Context.
 */

public class BrushTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Brush tool icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("drawing a line!");
    }
}
