package dleon.solid.DependencyInversionPrinciple.wrongExample;

public class SmsNotificationService {

    public void send(String message){
        System.out.println("Сообщение " + message + " отправлено!");
    }
}
