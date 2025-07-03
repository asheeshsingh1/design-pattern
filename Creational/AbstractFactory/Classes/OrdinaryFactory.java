package Creational.AbstractFactory.Classes;

import Creational.AbstractFactory.Interface.Vehicle;
import Creational.AbstractFactory.Interface.VehicleFactory;

public class OrdinaryFactory implements VehicleFactory{

    public Vehicle getVehicle(String vehicleName){
        switch (vehicleName) {
            case "SWIFT":
                return new Swift();
            case "Aura":
                return new Aura();
            default:
                return null;
        }
    }
}
