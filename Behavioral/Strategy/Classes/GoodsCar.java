package Behavioral.Strategy.Classes;

import Behavioral.Strategy.Interface.ClassImplementsInterface.NormalDrive;

public class GoodsCar extends Vehicle{
    public GoodsCar(){
        super(new NormalDrive());
    }
}
