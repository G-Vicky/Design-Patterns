package com.vicky;

import com.vicky.strategy.HighContrastFilter;
import com.vicky.strategy.ImageStorage;
import com.vicky.strategy.JPEGCompressor;
import com.vicky.strategy.PNGCompressor;

public class Main {

    public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage(new PNGCompressor(), new HighContrastFilter());
        imageStorage.store("filename.etc");
     }

}
