package Strategy.Interface.ClassImplementsInterface;

import Strategy.Interface.DriveStrategy;

public class NormalDrive implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("This is Normally driven vehicle");
    }
    
}
