package dleon.solid.DependencyInversionPrinciple.trueExample;

public class MessageService {
    private final NotificationService notificationService;

    public MessageService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void send(String message) {
        this.notificationService.send(message);
    }
}
