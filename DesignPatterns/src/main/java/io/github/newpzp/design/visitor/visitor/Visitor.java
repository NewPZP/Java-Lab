package io.github.newpzp.design.visitor.visitor;

import io.github.newpzp.design.visitor.shapes.Circle;
import io.github.newpzp.design.visitor.shapes.CompoundShape;
import io.github.newpzp.design.visitor.shapes.Dot;
import io.github.newpzp.design.visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
