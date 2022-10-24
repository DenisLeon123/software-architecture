package dleon.solid.InterfaceSegregationPrinciple.wrongExample;

public class MobileNotificationService implements NotificationService {
    @Override
    public void sendOnEmail(String email) {
        // ?????? у мобильного нет имейла, не понятно, как реализовывать
    }

    @Override
    public void sendOnMobileNumber(String number) {
        // реализация по отправки сообщения по номеру
    }

    @Override
    public void sendOnShortNumber(String number) {
        // реализация по отправки на короткий номер
    }
}
