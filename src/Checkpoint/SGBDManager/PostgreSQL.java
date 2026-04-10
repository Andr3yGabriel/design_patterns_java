package Checkpoint.SGBDManager;

import java.util.ArrayList;
import java.util.List;

public class PostgreSQL {
    private final List<User> users;

    public PostgreSQL() {
        this.users = new ArrayList<>();
    }

    void addUser(User user) {
        users.add(user);
    }

    void removeUser(User user) {
        users.remove(user);
    }

    void listUsers() {
        int index = 0;
        IO.println("\n=====Listando Usuários do PostgreSQL=====");
        for (User user : users) {
            IO.println(index + " - " + user.getName());
            index++;
        }
    }
}
