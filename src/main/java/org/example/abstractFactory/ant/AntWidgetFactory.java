package org.example.abstractFactory.ant;

import org.example.abstractFactory.Button;
import org.example.abstractFactory.TextBox;
import org.example.abstractFactory.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
}
