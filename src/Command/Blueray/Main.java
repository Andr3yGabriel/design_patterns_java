package Command.Blueray;

public class Main {
    void main() {
        Player player = new Player();

        DVD dvd = new DVD("Miranha 1");
        ICommand command = new DVDPlayer(dvd);

        player.setCommand(command);
        player.execute();
        player.undo();

        CD cd = new CD("Luan Santana");
        command = new CDPlayer(cd);

        player.setCommand(command);
        player.execute();
        player.undo();

        Blueray blr = new Blueray("Vingadores Ultimato");
        command = new BluerayPlayer(blr);

        player.setCommand(command);
        player.execute();
        player.undo();
    }
}
