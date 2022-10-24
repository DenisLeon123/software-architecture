package dleon.solid.LiskovSubstitutionPrinciple.wrongExample;

public class EmailMessage extends Message{

    @Override
    public void formattedAndSetText(String text) {
        throw new UnsupportedOperationException("Не поддерживаемая операция!!!");
    }

    @Override
    public void deleteText() {
        super.deleteText();
    }
}
