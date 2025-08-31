package Behavioral.Visitor.Classes;

import Behavioral.Visitor.Interface.HotelRoomElement;
import Behavioral.Visitor.Interface.RoomVisitor;

public class Main {
    public static void main(String[] args) {
        
        HotelRoomElement singleRoomObject = new SingleRoom();
        HotelRoomElement deluxeRoomObject = new DeluxeRoom();
        HotelRoomElement kingRoomObject = new KingRoom();

        RoomVisitor roomPriceVisitor = new PriceReviewVisitor();

        singleRoomObject.accept(roomPriceVisitor);
        deluxeRoomObject.accept(roomPriceVisitor);
        kingRoomObject.accept(roomPriceVisitor);

        RoomVisitor roomMaintenanceVisitor = new MaintainerVisitor();

        singleRoomObject.accept(roomMaintenanceVisitor);
        deluxeRoomObject.accept(roomMaintenanceVisitor);
        kingRoomObject.accept(roomMaintenanceVisitor);
    }
}
