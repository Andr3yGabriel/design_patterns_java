package Command.Games;

public class Joystick {
    private ICommand command;

    public void setCommand(ICommand c) {
        this.command = c;
    }

    public void clickButtonA() {
        command.execute();
    }

    public void clickButtonB() {
        command.undo();
    }
}
