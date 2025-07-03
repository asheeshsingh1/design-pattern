package Creational.AbstractFactory.Classes;

import Creational.AbstractFactory.Interface.VehicleFactory;

public class FactoryProducer {
    public static VehicleFactory getFactory(String type) {
       switch (type) {
            case "LUXURY":
                return new LuxuryFactory();
            case "ORDINARY":
                return new OrdinaryFactory();
            default:
                return null;
        }
    }
}
