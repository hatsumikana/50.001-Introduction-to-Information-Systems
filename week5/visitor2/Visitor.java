package com.hatsumi.week5.visitor2;

public interface Visitor {
    void visit(Car c);
    void visit(Alcohol a);
    void visit(Chocolate c);
}
