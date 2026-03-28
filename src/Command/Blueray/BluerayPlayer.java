package Command.Blueray;

public class BluerayPlayer implements ICommand {
    Blueray obj;

    public BluerayPlayer(Blueray obj) {
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
