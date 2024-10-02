public class MainFactory {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        
        Notification email = factory.createNotification("email");
        email.notifyUser();
        
        Notification sms = factory.createNotification("sms");
        sms.notifyUser();
        
        Notification push = factory.createNotification("push");
        push.notifyUser();
    }
}
