package Behavioral.Mediator.Classes;

import Behavioral.Mediator.Interface.AuctionMediator;
import Behavioral.Mediator.Interface.Colleague;

public class Bidder implements Colleague{
    String name;
    AuctionMediator auctionMediator;

    Bidder(AuctionMediator auctionMediator,String name){
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }


    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this, bidAmount);
    }

    @Override
    public void receiveBidNotification(int bidAmount) {
        System.out.println("Bidder: " + name + " got the notified someone put a bid of: " + bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }

}
