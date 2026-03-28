package Command.Games;

public class FightGamePlayer implements ICommand {
    FightGame fightGame;

    public FightGamePlayer(FightGame fightGame) {
        this.fightGame = fightGame;
    }

    @Override
    public void execute() {
        fightGame.clickButtonA();
    }

    @Override
    public void undo() {
        fightGame.clickButtonB();
    }
}
