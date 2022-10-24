package dleon.solid.LiskovSubstitutionPrinciple.wrongExample;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();

        Message message = new Message();
        SmsMessage smsMessage = new SmsMessage();
        EmailMessage emailMessage = new EmailMessage();

        notificationService.send(message, "hello");
        notificationService.send(smsMessage, "sms hello");

        // сломалось, так как операция formattedAndSetText в email не работает
        notificationService.send(emailMessage, "email hello");
    }
}
