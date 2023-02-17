package io.github.newpzp.design.abstractfactory.app;

import io.github.newpzp.design.abstractfactory.button.Button;
import io.github.newpzp.design.abstractfactory.checkbox.CheckBox;
import io.github.newpzp.design.abstractfactory.factories.GUIFactory;

public class Application {

    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory guiFactory){
        button = guiFactory.createButton();
        checkBox = guiFactory.createCheckBox();
    }
    public void paint(){
        button.paint();
        checkBox.paint();
    }
}
