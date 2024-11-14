package Service.Notification;

import Model.Notification.Notification;

public class NotificationService implements INotificationService {
    @Override
    public void sendNotification(Notification notification) {
        System.out.println("Sending the Notification : " +notification.toString());
    }
}
