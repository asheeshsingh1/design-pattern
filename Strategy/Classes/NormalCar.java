package Strategy.Classes;

import Strategy.Interface.ClassImplementsInterface.NormalDrive;

public class NormalCar extends Vehicle{
    NormalCar(){
        super(new NormalDrive());
    }
}
