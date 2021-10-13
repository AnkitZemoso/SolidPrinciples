package ankit.soliddemo.withsolid;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Sending Notification through email.");
    }
}
