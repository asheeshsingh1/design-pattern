package Behavioral.Visitor.Classes;

import Behavioral.Visitor.Interface.RoomVisitor;

public class MaintainerVisitor implements RoomVisitor{

    @Override
    public void visit(SingleRoom singleRoomObject) {
        System.out.println("Performing maintenance for single room.");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoomObject) {
        System.out.println("Performing maintenance for deluxe room.");
    }

    @Override
    public void visit(KingRoom kingRoomObject) {
        System.out.println("Performing maintenance for single room.");
    }
    
}
