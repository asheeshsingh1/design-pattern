package Structural.Bridge.Classes;

import Structural.Bridge.Interface.BreatheImplementor;

public class Human extends LivingThings{

    public Human(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breathingProcess() {
        breatheImplementor.breathingMethod();
    }
    
}
