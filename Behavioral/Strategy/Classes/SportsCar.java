package Behavioral.Strategy.Classes;

import Behavioral.Strategy.Interface.ClassImplementsInterface.SportsDrive;

public class SportsCar extends Vehicle{
    SportsCar(){
        super(new SportsDrive());
    };    
}
