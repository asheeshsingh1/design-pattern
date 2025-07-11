package Structural.Bridge.Classes;

import Structural.Bridge.Interface.BreatheImplementor;

public class WaterBreatheImpl implements BreatheImplementor{

    @Override
    public void breathingMethod() {
        System.out.println("Breathing in water.");
    }
    
}
