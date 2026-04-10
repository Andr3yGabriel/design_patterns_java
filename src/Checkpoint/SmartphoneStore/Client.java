package Checkpoint.SmartphoneStore;

public class Client {
    public enum ClientType {
        NORMAL,
        VIP,
        PREMIUM
    }

    private final String name;
    private ClientType clientType;

    public Client(String name, ClientType clientType) {
        this.name = name;
        this.clientType = clientType;
    }

    public String getName() {
        return name;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }
}
