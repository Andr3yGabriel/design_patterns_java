package Checkpoint.SGBDManager;

public class SQLServerCommand implements ICommand{
    private SQLServer sqlServer;
    private String lastOperation;
    private User lastOperationUser;

    public SQLServerCommand(SQLServer sqlServer) {
        this.sqlServer = sqlServer;
    }

    @Override
    public void add(User user) {
        sqlServer.addUser(user);
        this.lastOperation = "add";
        this.lastOperationUser = user;
    }

    @Override
    public void remove(User user) {
        sqlServer.removeUser(user);
        this.lastOperation = "remove";
        this.lastOperationUser = user;
    }

    @Override
    public void undo() {
        switch (this.lastOperation) {
            case "add":
                sqlServer.removeUser(this.lastOperationUser);
                lastOperationUser = null;
                lastOperation = null;
                break;
            case "remove":
                sqlServer.addUser(this.lastOperationUser);
                lastOperationUser = null;
                lastOperation = null;
                break;
        }
    }

    @Override
    public void list() {
        sqlServer.listUsers();
    }
}
