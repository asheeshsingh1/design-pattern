package Structural.Adapter.Classes;

import Structural.Adapter.Interface.WeightMachineAdapter;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineKg(new WeightMachinePound(100));  
        System.out.println("Weight in Kg is: " + weightMachineAdapter.getWeightInKg());
    }
}
