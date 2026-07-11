package FactoryPattern;

import FactoryPattern.Shape_.Shape;

public class Main {
    public static void main(String[] args) {
        
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("square");
        shape.draw();

    }
}
