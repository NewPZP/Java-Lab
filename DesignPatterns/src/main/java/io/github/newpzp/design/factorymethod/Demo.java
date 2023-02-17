package io.github.newpzp.design.factorymethod;

import io.github.newpzp.design.factorymethod.factories.Dialog;
import io.github.newpzp.design.factorymethod.factories.HtmlDialog;
import io.github.newpzp.design.factorymethod.factories.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }


    }
    static void runBusinessLogic() {
        dialog.renderWindow();
    }


}
