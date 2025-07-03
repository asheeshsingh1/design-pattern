package Creational.AbstractFactory.Classes;

import Creational.AbstractFactory.Interface.Vehicle;

public class Mercedes implements Vehicle{

    @Override
    public void name() {
        System.out.println("This is Luxury Mercedes");
    }
}
