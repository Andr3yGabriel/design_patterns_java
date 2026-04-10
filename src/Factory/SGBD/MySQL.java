package Factory.SGBD;

public class MySQL extends SGBD {
    public MySQL(String user, String password, String ConnectionString) {
        super(user, password, ConnectionString);
    }

    public String toString() {
        return "MySQL";
    }
}
