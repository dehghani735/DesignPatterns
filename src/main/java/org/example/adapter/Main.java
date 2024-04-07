package org.example.adapter;

import org.example.adapter.avaFilter.Caramel;

public class Main {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
//        imageView.apply(new VividFilter());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
