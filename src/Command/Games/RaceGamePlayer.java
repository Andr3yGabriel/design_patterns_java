package Command.Games;

public class RaceGamePlayer implements ICommand {
    RaceGame raceGame;

    public RaceGamePlayer(RaceGame raceGame) {
        this.raceGame = raceGame;
    }

    @Override
    public void execute() {
        raceGame.clickButtonA();
    }

    @Override
    public void undo() {
        raceGame.clickButtonB();
    }
}
