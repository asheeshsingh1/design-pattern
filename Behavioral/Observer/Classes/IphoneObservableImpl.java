package Behavioral.Observer.Classes;

import java.util.List;

import Behavioral.Observer.Interface.NotificationAlertObserver;
import Behavioral.Observer.Interface.StockObservable;

import java.util.ArrayList;

public class IphoneObservableImpl implements StockObservable{
    public List<NotificationAlertObserver> iphoneWaitingList = new ArrayList<>();
    int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) { 
        iphoneWaitingList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        iphoneWaitingList.remove(notificationAlertObserver);
    }

    @Override
    public void notifyUsers() {
        for(NotificationAlertObserver users: iphoneWaitingList){
            users.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if(stockCount == 0){
            notifyUsers();
        }
        stockCount += newStockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
