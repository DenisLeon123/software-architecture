package dleon.solid.DependencyInversionPrinciple.wrongExample;

public class EmailNotificationService {
    public void send(String message) {
        System.out.println("Сообщение " + message + " отправлено!");
    }
}
