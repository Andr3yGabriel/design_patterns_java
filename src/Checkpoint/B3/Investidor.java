package Checkpoint.B3;

public class Investidor implements Observador {
    private final String nome;

    public Investidor(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(int valorNovo, int valorAntigo) {
        if (valorNovo > valorAntigo) {
            IO.println("Investidor " + nome + ": ações aumentaram de preço, hora de vender!");
        } else if (valorNovo < valorAntigo) {
            IO.println("Investidor " + nome + ": ações caíram de preço, hora de comprar!");
        }
    }

    public String getNome() {
        return nome;
    }
}
