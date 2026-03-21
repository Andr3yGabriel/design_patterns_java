package singleton.admin;

public class Admin {
    private static final Admin uniqueInstance = new Admin();
    private int code;
    private String login;
    private String password;

    private Admin(){}

    public static Admin getInstance() {
        return uniqueInstance;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
