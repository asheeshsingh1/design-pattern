package Structural.Adapter.Classes;

import Structural.Adapter.Interface.WeightMachineAdapter;
import Structural.Adapter.Interface.WeightMachineAdaptee;

public class WeightMachineKg implements WeightMachineAdapter{

    WeightMachineAdaptee weightMachineAdaptee;

    public WeightMachineKg(WeightMachineAdaptee weightMachineAdaptee){
        this.weightMachineAdaptee = weightMachineAdaptee;
    }


    @Override
    public double getWeightInKg() {
        double weightInPounds = weightMachineAdaptee.getWeightInPounds();

        // convert pound to kg
        double weightInKg = weightInPounds * .45;
        return weightInKg;
    }
    
}
