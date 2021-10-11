package ankit.SolidDemo.WithSolid;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String medium) {
        System.out.println("Sending Notification through email.");
    }
}
