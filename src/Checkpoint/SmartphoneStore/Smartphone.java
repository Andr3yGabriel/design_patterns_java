package Checkpoint.SmartphoneStore;

public abstract class Smartphone {
    String description;
    Client client;

    public String getDescription() {
        return description;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public abstract double cost();
}
