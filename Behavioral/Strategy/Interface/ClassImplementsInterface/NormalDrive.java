package Behavioral.Strategy.Interface.ClassImplementsInterface;

import Behavioral.Strategy.Interface.DriveStrategy;

public class NormalDrive implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("This is Normally driven vehicle");
    }
    
}
