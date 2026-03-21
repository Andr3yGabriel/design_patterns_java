package singleton.manager;

public class Manager {
    public static volatile Manager uniqueInstance = new Manager();
    private String CPF;
    private String name;

    private Manager() {}

    public Manager getInstance() {
        if (uniqueInstance == null) {
            synchronized (Manager.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Manager();
                }
            }
        }
        return uniqueInstance;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
