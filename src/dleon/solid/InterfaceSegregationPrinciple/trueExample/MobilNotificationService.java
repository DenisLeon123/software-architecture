package dleon.solid.InterfaceSegregationPrinciple.trueExample;

public interface MobilNotificationService {
    void sendOnMobileNumber(String number);
    void sendOnShortNumber(String number);
}
