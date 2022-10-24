package dleon.solid.OpenClosedPrinciple.trueExample;

import dleon.solid.SingleResponsibilityPrinciple.trueExample.Message;

// для каждого типа отправки свой класс

public class EmailService implements NotificationService {
    @Override
    public boolean send(Message message) {
        return true;
    }
}
