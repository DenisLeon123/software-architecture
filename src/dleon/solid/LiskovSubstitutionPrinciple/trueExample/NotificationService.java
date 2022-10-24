package dleon.solid.LiskovSubstitutionPrinciple.trueExample;

public class NotificationService {
    public void send(Message message, String text) {
        System.out.println("Сообщение " + text + " было успешно отправлено!");
    }

    public void sendFormattedMessage(Message message) {
        System.out.println(message.getText());
    }
}
