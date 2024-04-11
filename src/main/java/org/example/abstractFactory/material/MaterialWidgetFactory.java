package org.example.abstractFactory.material;

import org.example.abstractFactory.Button;
import org.example.abstractFactory.TextBox;
import org.example.abstractFactory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
}
