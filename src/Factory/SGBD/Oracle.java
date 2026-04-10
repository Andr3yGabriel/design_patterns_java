package Factory.SGBD;

public class Oracle extends SGBD {
    public Oracle(String user, String password, String ConnectionString) {
        super(user, password, ConnectionString);
    }

    public String toString() {
        return "Oracle";
    }
}
