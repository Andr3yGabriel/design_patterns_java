package Observer.Siren;

public class Operario implements Observador{
    private String nome;
    private boolean trabalhando;

    public Operario(String nome) {
        this.nome = nome;
        this.trabalhando = true;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void update() {
        trabalhando = !trabalhando;
        if (trabalhando) {
            IO.println(nome + " está trabalhando.");
        } else {
            IO.println(nome + " parou de trabalhar devido à sirene.");
        }
    }
}
