package Factory.SGBD;

public class SGBD {
    private String user;
    private String password;
    private String ConnectionString;

    public SGBD(String user, String password, String ConnectionString) {
        this.user = user;
        this.password = password;
        this.ConnectionString = ConnectionString;
    }

    public String getUser() {
        return user;
    }
}
