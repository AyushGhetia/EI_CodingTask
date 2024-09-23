package creational;

public class NotificationFactory {
    public Notification createNotification(String type) {
        if (type.equalsIgnoreCase("email")) {
            return new EmailNotification();
        } else if (type.equalsIgnoreCase("sms")) {
            return new SMSNotification();
        }
        throw new IllegalArgumentException("Unknown notification type");
    }
}
