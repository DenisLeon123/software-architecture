package dleon.solid.LiskovSubstitutionPrinciple.trueExample;

public class EmailMessage extends Message {

    @Override
    public void deleteText() {
        super.deleteText();
    }
}
