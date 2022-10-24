package dleon.solid.LiskovSubstitutionPrinciple.wrongExample;

public class NotificationService {
    public void send(Message message, String text) {
        message.formattedAndSetText(text);
        System.out.println("Сообщение " + text + " было успешно отправлено!");
    }
}
