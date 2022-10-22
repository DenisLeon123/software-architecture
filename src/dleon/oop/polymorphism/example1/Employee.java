package dleon.oop.polymorphism.example1;

public class Employee implements Remove {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void remove() {
        System.out.println("Сотрудник " + getName() + " удален!");
    }
}
