package ankit.SolidDemo.WithSolid;

public class WhatsAppNotificationService implements NotificationService {
    @Override
    public void sendNotification(String medium) {
        System.out.println("Sending notificaton through WhatsApp");
    }
}
