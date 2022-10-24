package dleon.solid.DependencyInversionPrinciple.wrongExample;

public class MessageService {
    private final SmsNotificationService smsNotificationService;

    public MessageService(SmsNotificationService smsNotificationService) {
        this.smsNotificationService = smsNotificationService;
    }

    public void send(String message) {
        this.smsNotificationService.send(message);
    }
}
