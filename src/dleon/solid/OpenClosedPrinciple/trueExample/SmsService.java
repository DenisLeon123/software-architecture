package dleon.solid.OpenClosedPrinciple.trueExample;

import dleon.solid.SingleResponsibilityPrinciple.trueExample.Message;

public class SmsService implements NotificationService {
    @Override
    public boolean send(Message message) {
        return true;
    }
}
