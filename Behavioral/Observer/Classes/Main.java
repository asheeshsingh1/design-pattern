package Behavioral.Observer.Classes;

public class Main {
    public static void main(String[] args) {
        IphoneObservableImpl iphoneStockObservable = new IphoneObservableImpl();
        iphoneStockObservable.add(new EmailNotificationObserver("asheesh.singh@paytm.com",iphoneStockObservable));
        iphoneStockObservable.add(new EmailNotificationObserver("asheesh2.singh@paytm.com",iphoneStockObservable));
        iphoneStockObservable.add(new EmailNotificationObserver("asheesh3.singh@paytm.com",iphoneStockObservable));
        iphoneStockObservable.add(new MessageNotificationObserver("8218587678",iphoneStockObservable));

        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(-10);
        iphoneStockObservable.setStockCount(20);
        iphoneStockObservable.setStockCount(30);
    }
}
