package org.example.abstractFactory.ant;

import org.example.abstractFactory.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant TextBox");
    }
}
