package dleon.solid.LiskovSubstitutionPrinciple.wrongExample;

public class SmsMessage extends Message{

    @Override
    public void formattedAndSetText(String text) {
        super.setText("???" +text + "???");
    }

    @Override
    public void deleteText() {
        super.deleteText();
    }
}
