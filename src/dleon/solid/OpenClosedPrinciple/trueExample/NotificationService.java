package dleon.solid.OpenClosedPrinciple.trueExample;

import dleon.solid.SingleResponsibilityPrinciple.trueExample.Message;

// создается абстракция, затем уже под каждый тип создается конкретная реализация

public interface NotificationService {
    boolean send(Message message);
}
