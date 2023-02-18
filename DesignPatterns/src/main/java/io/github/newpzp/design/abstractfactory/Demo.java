package io.github.newpzp.design.abstractfactory;

import io.github.newpzp.design.abstractfactory.app.Application;
import io.github.newpzp.design.abstractfactory.factories.GUIFactory;
import io.github.newpzp.design.abstractfactory.factories.MacOSGUIFactory;
import io.github.newpzp.design.abstractfactory.factories.WindowsGUIFactory;

public class Demo {

    private static Application configureApplication(){
        Application application;
        GUIFactory guiFactory;
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            guiFactory = new MacOSGUIFactory();
        } else {
            guiFactory = new WindowsGUIFactory();
        }
        application= new Application(guiFactory);
        return application;
    }
}
