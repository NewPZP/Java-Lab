package io.github.newpzp.design.factorymethod.factories;

import io.github.newpzp.design.factorymethod.buttons.WindowsButton;
import io.github.newpzp.design.factorymethod.buttons.Button;
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}