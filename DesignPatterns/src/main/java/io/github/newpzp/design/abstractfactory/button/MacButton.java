package io.github.newpzp.design.abstractfactory.button;

public class MacButton implements Button{
    @Override
    public void paint() {
        System.out.println("Mac Button Created");
    }
}
