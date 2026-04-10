package Checkpoint.SGBDManager;

public class MySQLCommand implements ICommand {
    MySQL mySQL;
    String lastOperation;
    User lastOperationUser;

    public MySQLCommand(MySQL mySQL) {
        this.mySQL = mySQL;
    }

    @Override
    public void add(User user) {
        mySQL.addUser(user);
        lastOperation = "add";
        lastOperationUser = user;
    }

    @Override
    public void remove(User user) {
        mySQL.removeUser(user);
        lastOperation = "remove";
        lastOperationUser = user;
    }

    @Override
    public void undo() {
        switch(lastOperation) {
            case "add":
                mySQL.removeUser(lastOperationUser);
                lastOperationUser = null;
                lastOperation = null;
                break;
            case "remove":
                mySQL.addUser(lastOperationUser);
                lastOperationUser = null;
                lastOperation = null;
                break;
        }
    }

    @Override
    public void list() {
        mySQL.listUsers();
    }
}
