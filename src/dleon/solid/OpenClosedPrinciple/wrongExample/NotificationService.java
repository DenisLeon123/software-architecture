package dleon.solid.OpenClosedPrinciple.wrongExample;

import dleon.solid.SingleResponsibilityPrinciple.trueExample.Message;

// неверно, так как был изменен изначальный класс отправки сообщений, и при добавлении новых типов оповещений
// он постоянно будет меняться

public class NotificationService {

    public boolean sendMessage(Message message, String type) {
        // логика по отправки сообщения
        if (type.equals("sms")) {
            return true;
        } else if (type.equals("email")) {
            return true;
        }

        return true;
    }

}
