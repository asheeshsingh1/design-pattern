package Behavioral.Visitor.Interface;

import Behavioral.Visitor.Classes.DeluxeRoom;
import Behavioral.Visitor.Classes.KingRoom;
import Behavioral.Visitor.Classes.SingleRoom;

public interface RoomVisitor {
    public void visit(SingleRoom singleRoomObject);
    public void visit(DeluxeRoom deluxeRoomObject);
    public void visit(KingRoom kingRoomObject);
}
