package Service.Notification;

import Model.Notification.Notification;

public class NotificationService implements INotificationService {
    @Override
    public void sendNotification(Notification notification) {
        System.out.println("Send Notification: " +notification.toString());
    }

    @Override
    public void markAsRead(Notification notification) {
        System.out.println("Mark As Read: " +notification.toString());
    }
}
