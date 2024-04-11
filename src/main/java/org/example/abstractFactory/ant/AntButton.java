package org.example.abstractFactory.ant;

import org.example.abstractFactory.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant Button");
    }
}
