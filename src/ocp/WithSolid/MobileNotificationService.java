package ocp.WithSolid;

public class MobileNotificationService implements NotificationService{
    @Override
    public void sendNotification(String medium) {
        System.out.println("Sending Notification through Mobile.");
    }
}
