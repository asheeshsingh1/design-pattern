package Strategy.Classes;

import Strategy.Interface.ClassImplementsInterface.NormalDrive;

public class GoodsCar extends Vehicle{
    public GoodsCar(){
        super(new NormalDrive());
    }
}
