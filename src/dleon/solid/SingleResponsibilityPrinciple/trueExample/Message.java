package dleon.solid.SingleResponsibilityPrinciple.trueExample;

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
}
