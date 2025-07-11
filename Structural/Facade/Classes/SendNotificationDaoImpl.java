package Structural.Facade.Classes;

import Structural.Facade.Interface.SendNotificationDao;

public class SendNotificationDaoImpl implements SendNotificationDao{

    @Override
    public void sendNotification() {
        System.out.println("Notification sent");
    }
    
}
