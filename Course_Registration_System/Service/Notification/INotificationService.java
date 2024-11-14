package Service.Notification;

import Model.Notification.Notification;

public interface INotificationService {
    void sendNotification(Notification notification);
    void markAsRead(Notification notification);
}
