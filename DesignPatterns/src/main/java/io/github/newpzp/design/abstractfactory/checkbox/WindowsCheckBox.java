package io.github.newpzp.design.abstractfactory.checkbox;

public class WindowsCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("windows checkbox created");
    }
}
