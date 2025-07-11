package Structural.Bridge.Classes;

import Structural.Bridge.Interface.BreatheImplementor;

public class Fish extends LivingThings{

    public Fish(BreatheImplementor breatheImplementor){
        super(breatheImplementor);
    }

    @Override
    public void breathingProcess() {
        breatheImplementor.breathingMethod();
    }
    
}
