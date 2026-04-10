package Checkpoint.SGBDManager;

public interface ICommand {
    void add(User user);
    void remove(User user);
    void undo();
    void list();
}
