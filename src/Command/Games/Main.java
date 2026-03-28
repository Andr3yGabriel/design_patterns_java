package Command.Games;

public class Main {
    void main() {
        FightGame fightGame = new FightGame();
        RaceGame raceGame = new RaceGame();

        FightGamePlayer fightGamePlayer = new FightGamePlayer(fightGame);
        RaceGamePlayer raceGamePlayer = new RaceGamePlayer(raceGame);

        ICommand command = fightGamePlayer;
        Joystick joystick = new Joystick();

        joystick.setCommand(command);
        joystick.clickButtonA();
        joystick.clickButtonB();

        command = raceGamePlayer;

        joystick.setCommand(command);
        joystick.clickButtonA();
        joystick.clickButtonB();
    }
}
