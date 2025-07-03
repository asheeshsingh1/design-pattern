package Creational.Factory.Classes;

import Creational.Factory.Interface.Shape;

public class Triangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Triangle");
    }
    
}
