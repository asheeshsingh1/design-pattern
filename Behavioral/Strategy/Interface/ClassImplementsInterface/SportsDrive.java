package Behavioral.Strategy.Interface.ClassImplementsInterface;

import Behavioral.Strategy.Interface.DriveStrategy;

public class SportsDrive implements DriveStrategy{
    
    @Override
    public void drive(){
        System.out.println("This is sporty driven vehicle");
    }
}
