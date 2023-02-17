package io.github.newpzp.design.abstractfactory.factories;

import io.github.newpzp.design.abstractfactory.button.Button;
import io.github.newpzp.design.abstractfactory.button.WindowsButton;
import io.github.newpzp.design.abstractfactory.checkbox.CheckBox;
import io.github.newpzp.design.abstractfactory.checkbox.WindowsCheckBox;

public class WindowsGUIFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
