package io.github.newpzp.design.abstractfactory.factories;

import io.github.newpzp.design.abstractfactory.button.Button;
import io.github.newpzp.design.abstractfactory.checkbox.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
