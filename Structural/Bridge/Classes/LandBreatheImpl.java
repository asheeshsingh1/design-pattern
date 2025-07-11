package Structural.Bridge.Classes;

import Structural.Bridge.Interface.BreatheImplementor;

public class LandBreatheImpl implements BreatheImplementor{

    @Override
    public void breathingMethod() {
        System.out.println("Breathing on land.");
    }
    
}
