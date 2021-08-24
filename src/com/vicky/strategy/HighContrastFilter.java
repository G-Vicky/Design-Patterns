package com.vicky.strategy;

public class HighContrastFilter implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("applying High contrast filter");
    }
}
