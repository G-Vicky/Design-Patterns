package com.vicky.state;

/**
 * Concrete State: Each subclass implements a behavior associated with a state of Context.
 */

public class SelectionTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("selection tool icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("dotted rectangle selector");
    }
}
