package Strategy.Classes;

import Strategy.Interface.ClassImplementsInterface.SportsDrive;

public class SportsCar extends Vehicle{
    SportsCar(){
        super(new SportsDrive());
    };    
}
