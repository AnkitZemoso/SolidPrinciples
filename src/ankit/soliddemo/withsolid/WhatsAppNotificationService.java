package ankit.soliddemo.withsolid;

public class WhatsAppNotificationService implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Sending notificaton through WhatsApp");
    }
}
