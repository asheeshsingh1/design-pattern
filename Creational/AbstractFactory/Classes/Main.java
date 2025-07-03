package Creational.AbstractFactory.Classes;

import Creational.AbstractFactory.Interface.Vehicle;
import Creational.AbstractFactory.Interface.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        // Get Luxury Factory
        VehicleFactory luxuryFactory = FactoryProducer.getFactory("LUXURY");
        Vehicle luxuryVehicle = luxuryFactory.getVehicle("BMW");
        Vehicle luxuryVehicle2 = luxuryFactory.getVehicle("MERCEDES");
        luxuryVehicle.name();
        luxuryVehicle2.name();

        // Get Ordinary Factory
        VehicleFactory ordinaryFactory = FactoryProducer.getFactory("ORDINARY");
        Vehicle ordinaryVehicle = ordinaryFactory.getVehicle("SWIFT");
        Vehicle ordinaryVehicle2 = ordinaryFactory.getVehicle("AURA");
        ordinaryVehicle.name();
        ordinaryVehicle2.name();
    }
}
