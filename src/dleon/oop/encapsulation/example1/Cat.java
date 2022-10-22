package dleon.oop.encapsulation.example1;

public class Cat {
    // скрыли состояние полей
    private String name;
    private int age;
    private String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // скрываю служебный метод formatedFullDescription() от пользователя, предоставляю готовый для использования getFullDescription()
    public String getFullDescription() {
        return formatedFullDescription();
    }

    private String formatedFullDescription() {
        return "Имя кота: " + getName() + ", возраст: " + getAge() + ", расцветка: " + getColor() + ".";
    }
}

