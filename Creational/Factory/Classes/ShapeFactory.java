package Creational.Factory.Classes;

import Creational.Factory.Interface.Shape;

public class ShapeFactory {
    
    Shape getShape(String shape){
        switch (shape) {
            case "SQUARE":
                return new Square();
            case "TRIANGLE":
                return new Triangle();
            default:
                return null;
        }
    }
}
