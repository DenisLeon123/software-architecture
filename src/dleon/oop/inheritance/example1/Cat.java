package dleon.oop.inheritance.example1;

public class Cat extends Animal {

    public Cat(String name, String voice) {
        super(name, voice);
    }

    @Override
    public String say() {
        return "Меня зовут " + getName() + ", " + getVoice() + " и у меня свой  метод";
    }
}
