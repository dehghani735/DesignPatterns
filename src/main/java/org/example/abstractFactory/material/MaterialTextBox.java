package org.example.abstractFactory.material;

import org.example.abstractFactory.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material TextBox");
    }
}
