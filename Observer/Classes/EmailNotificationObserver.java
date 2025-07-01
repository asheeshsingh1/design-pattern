package Observer.Classes;

import Observer.Interface.NotificationAlertObserver;
import Observer.Interface.StockObservable;

public class EmailNotificationObserver implements NotificationAlertObserver{
    String emailID;
    StockObservable observable;

    public EmailNotificationObserver(String emailID,StockObservable observable){
        this.emailID = emailID;
        this.observable = observable;
    }

    public void update(){
        sendEmail(emailID);
    }

    public void sendEmail(String emailID){
        System.out.println("Email has been sent to: " + emailID);
    }
}
