package Structural.Bridge.Classes;

import Structural.Bridge.Interface.BreatheImplementor;

public abstract class LivingThings {
    BreatheImplementor breatheImplementor;

    public LivingThings(BreatheImplementor breatheImplementor){
        this.breatheImplementor = breatheImplementor;
    }

    public abstract void breathingProcess();
}
