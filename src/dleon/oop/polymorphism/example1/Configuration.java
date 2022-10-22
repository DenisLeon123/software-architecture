package dleon.oop.polymorphism.example1;


public class Configuration implements Remove {
    private String configuration;

    public Configuration(String configuration) {
        this.configuration = configuration;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    @Override
    public void remove() {
        System.out.println("Конфигурация " + getConfiguration() + " удалена!");
    }
}
