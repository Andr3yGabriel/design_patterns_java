package Checkpoint.SGBDManager;

public class PostgreSQLCommand implements ICommand {
    private PostgreSQL psql;
    private String lastOperation;
    private User lastOperationUser;

    public PostgreSQLCommand(PostgreSQL psql) {
        this.psql = psql;
    }

    @Override
    public void add(User user) {
        psql.addUser(user);
        this.lastOperation = "add";
        this.lastOperationUser = user;
    }

    @Override
    public void remove(User user) {
        psql.removeUser(user);
        this.lastOperation = "remove";
        this.lastOperationUser = user;
    }

    @Override
    public void undo() {
        switch (this.lastOperation) {
            case "add":
                psql.removeUser(this.lastOperationUser);
                lastOperationUser = null;
                lastOperation = null;
                break;
            case "remove":
                psql.addUser(this.lastOperationUser);
                lastOperationUser = null;
                lastOperation = null;
                break;
        }
    }

    @Override
    public void list() {
        psql.listUsers();
    }
}
