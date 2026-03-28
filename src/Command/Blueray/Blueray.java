package Command.Blueray;

public class Blueray {
    String name;

    public Blueray(String name) {
        this.name = name;
    }

    void play() {
        IO.println("Lendo Bluray...");
        IO.println("Exibindo: " + name);
    }

    void pause() {
        IO.println("Pausando Bluray...");
    }
}
