package io.github.newpzp.design.visitor.shapes;

import io.github.newpzp.design.visitor.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}