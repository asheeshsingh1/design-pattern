package Observer.Interface;

public interface StockObservable {
    public void add(NotificationAlertObserver notificationAlertObserver);
    public void remove(NotificationAlertObserver notificationAlertObserver);
    public void notifyUsers();
    public void setStockCount(int newStockCount);
    public int getStockCount();
}
