package Creational.AbstractFactory.Classes;

import Creational.AbstractFactory.Interface.Vehicle;

public class Aura implements Vehicle{

    @Override
    public void name() {
        System.out.println("This is a ordinary Aura");
    }
    
}
