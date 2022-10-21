package dleon.oop.abstraction.example1;

public class OfficialEmployee extends Employee {
    private Function function;

    public OfficialEmployee(String name, int age, Function function) {
        super(name, age);
        this.function = function;
    }

    @Override
    public String toString() {
        return "OfficialEmployee{" +
                "function=" + function +
                "} " + super.toString();
    }
}

enum Function {
    ACCOUNTER,
    MANAGER,
    DIRECTOR;
}
