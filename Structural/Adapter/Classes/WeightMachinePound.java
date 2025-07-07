package Structural.Adapter.Classes;

import Structural.Adapter.Interface.WeightMachineAdaptee;

public class WeightMachinePound implements WeightMachineAdaptee{

    int weight;

    public WeightMachinePound(int weight){
        this.weight = weight;
    }

    @Override
    public double getWeightInPounds() {
        return this.weight;
    }
    
}
