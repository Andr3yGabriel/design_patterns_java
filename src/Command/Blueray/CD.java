package Command.Blueray;

public class CD {
    String name;

    public CD(String name) {
        this.name = name;
    }

    void play() {
        IO.println("Lendo CD...");
        IO.println("Tocando: " + name);
    }

    void pause() {
        IO.println("Pausando CD...");
    }
}
