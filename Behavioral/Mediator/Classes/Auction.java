package Behavioral.Mediator.Classes;

import java.util.ArrayList;
import java.util.List;

import Behavioral.Mediator.Interface.AuctionMediator;
import Behavioral.Mediator.Interface.Colleague;

public class Auction implements AuctionMediator{

    List<Colleague> colleagues = new ArrayList<Colleague>();

    @Override
    public void addBidder(Colleague bidder) {
        colleagues.add(bidder);
    }

    @Override
    public void placeBid(Colleague bidder, int bidAmount) {
        for(Colleague colleague: colleagues){
            if(!colleague.getName().equals(bidder.getName())){
                colleague.receiveBidNotification(bidAmount);
            }
        }
    }
    
}
