package ankit.soliddemo.withsolid;

public class MobileNotificationService implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Sending Notification through Mobile.");
    }
}
