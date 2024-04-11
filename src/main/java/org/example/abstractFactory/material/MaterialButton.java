package org.example.abstractFactory.material;

import org.example.abstractFactory.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material Button");
    }
}
