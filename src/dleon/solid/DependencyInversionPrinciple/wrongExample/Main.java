package dleon.solid.DependencyInversionPrinciple.wrongExample;

public class Main {
    public static void main(String[] args) {
        SmsNotificationService smsNotificationService = new SmsNotificationService();

        MessageService messageService = new MessageService(smsNotificationService);
        messageService.send("hello");

        // а как же его использовать? Переделывать messageService?
        EmailNotificationService emailNotificationService = new EmailNotificationService();
    }
}
