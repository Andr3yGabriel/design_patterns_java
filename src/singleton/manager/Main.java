package singleton.manager;

public class Main {
    void main() {
        Manager manager = Manager.uniqueInstance;
        manager.setCPF("123456789");
        manager.setName("John Doe");

        String s = "New Manager\nName: %s\nCPF: %s\n";
        IO.println(String.format(s, manager.getName(), manager.getCPF()));

        manager.setName("Andrey");
        manager.setCPF("456789001");

        s = "New Manager\nName: %s\nCPF: %s\n";
        IO.println(String.format(s, manager.getName(), manager.getCPF()));
    }
}
