package singleton.admin;

public class Forum {
    void main() {
        Admin admin = Admin.getInstance();

        admin.setCode(1);
        admin.setLogin("admin");
        admin.setPassword("admin");

        String s = "Code: %d\nLogin: %s\nPassword: %s";
        IO.println(String.format(s, admin.getCode(), admin.getLogin(), admin.getPassword()));

        admin.setCode(2);
        admin.setLogin("administrador");
        admin.setPassword("1234");

        IO.println(String.format(s, admin.getCode(), admin.getLogin(), admin.getPassword()));
    }
}
