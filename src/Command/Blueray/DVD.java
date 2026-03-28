package Command.Blueray;

public class DVD {
    String name;

    public DVD(String name) {
        this.name = name;
    }

    void play() {
        IO.println("Lendo DVD...");
        IO.println("Exibindo: " + name);
    }

    void pause() {
        IO.println("Pausando DVD...");
    }
}
