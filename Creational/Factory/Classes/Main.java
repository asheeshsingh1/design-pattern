package Creational.Factory.Classes;

import Creational.Factory.Interface.Shape;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactoryObject = new ShapeFactory();

        Shape shapeObject = shapeFactoryObject.getShape("SQUARE");
        Shape shapeObject2 = shapeFactoryObject.getShape("TRIANGLE");
        
        shapeObject.draw();
        shapeObject2.draw();
    }
}
