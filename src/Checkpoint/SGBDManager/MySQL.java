package Checkpoint.SGBDManager;

import java.util.ArrayList;
import java.util.List;

public class MySQL {
    private final List<User> users;

    public MySQL() {
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
        IO.println("\n=====Listando Usuários do MySQL=====");
        for (User user : users) {
            IO.println(index + " - " + user.getName());
            index++;
        }
    }
}
