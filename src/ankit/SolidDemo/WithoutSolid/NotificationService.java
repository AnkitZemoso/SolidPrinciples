package ankit.SolidDemo.WithoutSolid;

public class NotificationService {
    public void sendNotification(String medium){
        if(medium.equals("email")){
            System.out.println("Sending Notification through Email");
        }
        if(medium.equals("mobile")){
            System.out.println("Sending Notification through mobile");
        }
    }
}

// Suppose we want to send notification through whatsApp also if we do any changes now in Notification Service it will
//voilate the open closed principle
