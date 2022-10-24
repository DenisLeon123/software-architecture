package dleon.solid.InterfaceSegregationPrinciple.wrongExample;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendOnEmail(String email) {
//        отправка на почтовый адрес
    }

    @Override
    public void sendOnMobileNumber(String number) {
//        ???????? у почтового сервиса нет номер, что делать
    }

    @Override
    public void sendOnShortNumber(String number) {
//        ???????? у почтового сервиса нет номер, что делать
    }
}
