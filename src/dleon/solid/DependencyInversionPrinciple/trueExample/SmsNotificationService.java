package dleon.solid.DependencyInversionPrinciple.trueExample;

public class SmsNotificationService implements NotificationService{

    @Override
    public void send(String message){
        System.out.println("Сообщение " + message + " отправлено!");
    }
}
