package dleon.oop.abstraction.example1;

public class Main {

    public static void main(String[] args) {
        OfficialEmployee officialEmployee = new OfficialEmployee("Peter", 24, Function.ACCOUNTER);
        RemoteEmployee remoteEmployee = new RemoteEmployee("Sergey", 45, City.MOSKOV);

        Employee employee = new RemoteEmployee("Andrei", 23, City.KASAN);

        System.out.println(officialEmployee);
        System.out.println(remoteEmployee);
        System.out.println(employee);
    }
}
