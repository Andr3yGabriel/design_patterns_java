package Command.Blueray;

public class DVDPlayer implements ICommand {
    DVD obj;

    public DVDPlayer(DVD obj) {
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
