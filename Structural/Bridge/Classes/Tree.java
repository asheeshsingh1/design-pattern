package Structural.Bridge.Classes;

import Structural.Bridge.Interface.BreatheImplementor;

public class Tree extends LivingThings{

    public Tree(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breathingProcess() {
        breatheImplementor.breathingMethod();
    }
    
}
