package io.github.newpzp.design.abstractfactory.factories;

import io.github.newpzp.design.abstractfactory.button.Button;
import io.github.newpzp.design.abstractfactory.button.MacButton;
import io.github.newpzp.design.abstractfactory.checkbox.CheckBox;
import io.github.newpzp.design.abstractfactory.checkbox.MacCheckBox;

public class MacOSGUIFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
