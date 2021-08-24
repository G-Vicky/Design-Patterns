package com.vicky.strategy;

public class PNGCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using PNG");
    }
}
