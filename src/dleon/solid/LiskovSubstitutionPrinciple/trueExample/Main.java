package dleon.solid.LiskovSubstitutionPrinciple.trueExample;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();

        Message message = new Message();
        SmsMessage smsMessage = new SmsMessage();
        EmailMessage emailMessage = new EmailMessage();

        notificationService.send(message, "hello");

        // настройка смс сообщения
        smsMessage.formattedAndSetText("sms hello");
        notificationService.sendFormattedMessage(smsMessage);

        notificationService.send(emailMessage, "email hello");
    }
}
