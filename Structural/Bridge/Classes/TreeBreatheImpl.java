package Structural.Bridge.Classes;

import Structural.Bridge.Interface.BreatheImplementor;

public class TreeBreatheImpl implements BreatheImplementor{

    @Override
    public void breathingMethod() {
        System.out.println("Breathing like tree");
    }
    
}
