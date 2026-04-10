package Checkpoint.SGBDManager;

public class OracleCommand implements ICommand {
    private Oracle oracle;
    private String lastOperation;
    private User lastOperationUser;

    public OracleCommand(Oracle oracle) {
        this.oracle = oracle;
    }

    @Override
    public void add(User user) {
        oracle.addUser(user);
        this.lastOperation = "add";
        this.lastOperationUser = user;
    }

    @Override
    public void remove(User user) {
        oracle.removeUser(user);
        this.lastOperation = "remove";
        this.lastOperationUser = user;
    }

    @Override
    public void undo() {
        switch (this.lastOperation) {
            case "add":
                oracle.removeUser(this.lastOperationUser);
                this.lastOperationUser = null;
                this.lastOperation = null;
                break;
            case "remove":
                oracle.addUser(this.lastOperationUser);
                this.lastOperationUser = null;
                this.lastOperation = null;
                break;
        }
    }

    @Override
    public void list() {
        oracle.listUsers();
    }
}
