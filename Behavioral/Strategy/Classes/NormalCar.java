package Behavioral.Strategy.Classes;

import Behavioral.Strategy.Interface.ClassImplementsInterface.NormalDrive;

public class NormalCar extends Vehicle{
    NormalCar(){
        super(new NormalDrive());
    }
}
