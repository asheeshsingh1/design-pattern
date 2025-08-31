package Behavioral.Visitor.Interface;

public interface HotelRoomElement {
    public void accept(RoomVisitor visitor);
}
