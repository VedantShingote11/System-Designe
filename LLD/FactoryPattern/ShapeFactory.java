package FactoryPattern;

import FactoryPattern.Shape_.Circle;
import FactoryPattern.Shape_.Shape;
import FactoryPattern.Shape_.Square;

public class ShapeFactory {
    
    Shape getShape(String value){

        switch (value) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            default:
                return null;
        }
        
    }
}
