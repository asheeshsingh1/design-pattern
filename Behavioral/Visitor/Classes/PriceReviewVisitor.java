package Behavioral.Visitor.Classes;

import Behavioral.Visitor.Interface.RoomVisitor;

public class PriceReviewVisitor implements RoomVisitor{

    @Override
    public void visit(SingleRoom singleRoomObject) {
        singleRoomObject.roomPrice = 1000;
        System.out.println("Price has been set as: " + singleRoomObject.roomPrice + " for single room.");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoomObject) {
        deluxeRoomObject.roomPrice = 2000;
        System.out.println("Price has been set as: " + deluxeRoomObject.roomPrice + " for deluxe room.");
    }

    @Override
    public void visit(KingRoom kingRoomObject) {
        kingRoomObject.roomPrice = 5000;
        System.out.println("Price has been set as: " + kingRoomObject.roomPrice + " for king room.");
    }
    
}
