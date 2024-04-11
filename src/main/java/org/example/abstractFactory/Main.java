package org.example.abstractFactory;

import org.example.abstractFactory.ant.AntWidgetFactory;
import org.example.abstractFactory.app.ContactForm;
import org.example.abstractFactory.material.MaterialWidgetFactory;

public class Main {
    public static void main(String[] args) {
//        new ContactForm().render(new MaterialWidgetFactory());
        new ContactForm().render(new AntWidgetFactory());
    }
}
