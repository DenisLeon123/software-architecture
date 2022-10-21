package dleon.oop.polymorphism.example1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration("configuration 2222");
        Employee employee = new Employee("new Emploee Denis");

        List<Remove> removeList = new ArrayList<>();
        removeList.add(configuration);
        removeList.add(employee);

        for (Remove objectForRemove : removeList) {
            objectForRemove.remove();
        }
    }
}
