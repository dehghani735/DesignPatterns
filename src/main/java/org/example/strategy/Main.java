package org.example.strategy;

public class Main {
    public static void main(String[] args) {
//        var imageStorage = new ImageStorage(new JpegCompressor(), new BlackAndWhiteFilter());
        var imageStorage = new ImageStorage(new PngCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("a");
    }
}
