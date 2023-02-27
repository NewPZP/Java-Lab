package io.github.newpzp.design.intermediary.components;

import io.github.newpzp.design.intermediary.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}