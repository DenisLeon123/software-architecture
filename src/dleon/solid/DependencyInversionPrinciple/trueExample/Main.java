package dleon.solid.DependencyInversionPrinciple.trueExample;

public class Main {
    public static void main(String[] args) {
        SmsNotificationService smsNotificationService = new SmsNotificationService();

        MessageService messageService = new MessageService(smsNotificationService);
        messageService.send("hello");

        EmailNotificationService emailNotificationService = new EmailNotificationService();

        MessageService emailMessageService = new MessageService(emailNotificationService);
        emailMessageService.send("hello email message");
    }
}
