package Observer.Classes;

import Observer.Interface.StockObservable;

import Observer.Interface.NotificationAlertObserver;

public class MessageNotificationObserver implements NotificationAlertObserver{
    String phoneNumber;
    StockObservable observable;

    public MessageNotificationObserver(String phoneNumber,StockObservable observable){
        this.observable = observable;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update() {
        sendMessage(phoneNumber);
    }

    public void sendMessage(String phoneNumber){
        System.out.println("Text message has been sent to: " + phoneNumber);
    }
}
