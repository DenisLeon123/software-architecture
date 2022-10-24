package dleon.solid.InterfaceSegregationPrinciple.wrongExample;

public interface NotificationService {
    void sendOnEmail(String email);
    void sendOnMobileNumber(String number);
    void sendOnShortNumber(String number);
}
