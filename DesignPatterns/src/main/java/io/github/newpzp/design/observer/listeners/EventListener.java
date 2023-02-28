package io.github.newpzp.design.observer.listeners;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
