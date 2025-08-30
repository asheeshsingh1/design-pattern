package Behavioral.Mediator.Interface;

public interface Colleague {
    public void placeBid(int bidAmount);
    public void receiveBidNotification(int bidAmount);
    String getName();
}
