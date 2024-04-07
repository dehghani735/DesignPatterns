package org.example.adapter;

import org.example.adapter.avaFilter.Caramel;

public class CaramelAdapter extends Caramel implements Filter{
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
