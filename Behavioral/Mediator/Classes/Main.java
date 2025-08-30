package Behavioral.Mediator.Classes;

public class Main {
    public static void main(String[] args) {

        // Creating an auction and adding bidders to it
        Auction auction = new Auction();

        new Bidder(auction, "Asheesh");
        new Bidder(auction, "Abhishek");
        new Bidder(auction, "Anju");
        new Bidder(auction, "Kashish");

        auction.placeBid(auction.colleagues.get(0), 2000);


        auction.placeBid(auction.colleagues.get(1), 3000);
    }
}
