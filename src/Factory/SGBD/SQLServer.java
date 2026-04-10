package Factory.SGBD;

public class SQLServer  extends SGBD {
    public SQLServer(String user, String password, String ConnectionString) {
        super(user, password, ConnectionString);
    }

    @Override
    public String toString() {
        return "SQLServer";
    }
}
