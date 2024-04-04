package org.example.strategy;

public class ImageStorage {

    private Compressor compressor;
    private Filter filter;

    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        // JPEG, PNG, ...
        // B&W, High contrast

        compressor.compress(fileName);
        filter.apply(fileName);
    }
}
