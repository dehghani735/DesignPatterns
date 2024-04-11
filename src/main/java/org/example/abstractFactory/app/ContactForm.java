package org.example.abstractFactory.app;

import org.example.abstractFactory.Theme;
import org.example.abstractFactory.WidgetFactory;
import org.example.abstractFactory.ant.AntButton;
import org.example.abstractFactory.ant.AntTextBox;
import org.example.abstractFactory.material.MaterialButton;
import org.example.abstractFactory.material.MaterialTextBox;

public class ContactForm {
    // allow the user to change the theme at runtime
    public void render(WidgetFactory factory) {
        factory.createButton().render();
        factory.createTextBox().render();
    }
}
