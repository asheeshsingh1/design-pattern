package Creational.AbstractFactory.Classes;

import Creational.AbstractFactory.Interface.Vehicle;

public class Swift implements Vehicle{

    @Override
    public void name() {
        System.out.println("This is ordinary Swift");
    }
    
}
