package dleon.solid.LiskovSubstitutionPrinciple.wrongExample;

public class Message {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void formattedAndSetText(String text) {
        this.text = text + "...";
    }

    public void deleteText() {
        this.text = null;
    }
}
