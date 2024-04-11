package org.example.abstractFactory.app;

import org.example.abstractFactory.Theme;
import org.example.abstractFactory.ant.AntButton;
import org.example.abstractFactory.ant.AntTextBox;
import org.example.abstractFactory.material.MaterialButton;
import org.example.abstractFactory.material.MaterialTextBox;

public class ContactForm {
    // allow the user to change the theme at runtime
    public void render(Theme theme) {
        if (theme == Theme.ANT) {
            new AntButton().render();
            new AntTextBox().render();
        } else if (theme == Theme.MATERIAL) {
            new MaterialButton().render();
            new MaterialTextBox().render();
        }
    }
}
