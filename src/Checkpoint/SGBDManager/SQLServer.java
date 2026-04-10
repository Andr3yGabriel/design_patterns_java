package Checkpoint.SGBDManager;

import java.util.ArrayList;
import java.util.List;

public class SQLServer {
    private final List<User> users;

    public SQLServer() {
        this.users = new ArrayList<User>();
    }

    void addUser(User user) {
        users.add(user);
    }

    void removeUser(User user) {
        users.remove(user);
    }

    void listUsers() {
        int index = 0;
        IO.println("\n=====Listando Usuários do SQL Server=====");
        for (User user : users) {
            IO.println(index + " - " + user.getName());
            index++;
        }
    }
}
