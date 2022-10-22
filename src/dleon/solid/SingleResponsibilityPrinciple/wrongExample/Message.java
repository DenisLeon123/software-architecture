package dleon.solid.SingleResponsibilityPrinciple.wrongExample;

import java.time.ZonedDateTime;

public class Message {
    private String text;
    private int id;
    private ZonedDateTime messageDataTime;

    public Message(String text, int id, ZonedDateTime messageDataTime) {
        this.text = text;
        this.id = id;
        this.messageDataTime = messageDataTime;
    }

    public boolean sendMessage(Message message) {
        // какая то логика по отправке сообщения
        return true;
    }

    public boolean save(Message message) {
        // какая то логика по сохранению сообщения
        return true;
    }
}
