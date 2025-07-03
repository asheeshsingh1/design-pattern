package Creational.AbstractFactory.Classes;

import Creational.AbstractFactory.Interface.Vehicle;

public class BMW implements Vehicle{

    @Override
    public void name() {
        System.out.println("This is a luxury BMW");
    }
    
}
