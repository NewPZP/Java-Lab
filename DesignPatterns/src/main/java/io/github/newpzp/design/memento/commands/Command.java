package io.github.newpzp.design.memento.commands;

public interface Command {
    String getName();
    void execute();
}