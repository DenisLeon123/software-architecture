package dleon.solid.LiskovSubstitutionPrinciple.trueExample;

public class SmsMessage extends Message {

    public void formattedAndSetText(String text) {
        super.setText("???" +text + "???");
    }

    @Override
    public void deleteText() {
        super.deleteText();
    }
}
