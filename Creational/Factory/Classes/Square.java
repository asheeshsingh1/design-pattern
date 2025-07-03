package Creational.Factory.Classes;

import Creational.Factory.Interface.Shape;

public class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Square");
    }
    
}
