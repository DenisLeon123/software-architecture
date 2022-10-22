package dleon.oop.abstraction.example1;

public class RemoteEmployee extends Employee {
    private City city;

    public RemoteEmployee(String name, int age, City city) {
        super(name, age);
        this.city = city;
    }

    @Override
    public String toString() {
        return "RemoteEmployee{" +
                "city=" + city +
                "} " + super.toString();
    }
}

enum City {
    MOSKOV,
    SAINTPETERSBURG,
    KASAN;
}
