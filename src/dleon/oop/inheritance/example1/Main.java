package dleon.oop.inheritance.example1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Кори", "Мяу");
        Dog dog = new Dog("Ронда", "Гав");
        Rooster rooster = new Rooster("Петя", "Ку ка ре ку");

        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(rooster);

        animals.stream().forEach(animal -> System.out.println(animal.say()));
    }
}
