package Behavioral.Visitor.Classes;

import Behavioral.Visitor.Interface.HotelRoomElement;
import Behavioral.Visitor.Interface.RoomVisitor;

public class SingleRoom implements HotelRoomElement{

    public int roomPrice = 0;

    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
