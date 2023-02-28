package io.github.newpzp.design.observer;

import io.github.newpzp.design.observer.editor.Editor;
import io.github.newpzp.design.observer.listeners.EmailNotificationListener;
import io.github.newpzp.design.observer.listeners.LogOpenListener;

public class Demo {

        public static void main(String[] args) {
            Editor editor = new Editor();
            editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
            editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

            try {
                editor.openFile("test.txt");
                editor.saveFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}
