package Command.Blueray;

public class CDPlayer implements ICommand {
    CD obj;

    public CDPlayer(CD obj) {
        this.obj = obj;
    }

    @Override
    public void execute() {
        obj.play();
    }

    @Override
    public void undo() {
        obj.pause();
    }
}
