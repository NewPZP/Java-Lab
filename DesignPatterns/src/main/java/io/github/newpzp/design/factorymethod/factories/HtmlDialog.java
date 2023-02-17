package io.github.newpzp.design.factorymethod.factories;

import io.github.newpzp.design.factorymethod.buttons.Button;
import io.github.newpzp.design.factorymethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}