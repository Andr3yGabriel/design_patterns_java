package Checkpoint.B3;

import java.util.ArrayList;
import java.util.List;

public class Bolsa {
    private final List<Observador> observadores;
    private int valorAntigo = 0;

    public Bolsa() {observadores = new ArrayList<Observador>();}

    public void addObservador(Observador observador) {
        IO.println("\nAdicionando observador: " + ((Investidor)observador).getNome());
        observadores.add(observador);
    }

    public void alterarValores(int valorNovo) {
        IO.println("\n=====Alterações no valor das ações!=====\nValor Antigo: R$"  + this.valorAntigo + "\nValor Novo: R$" + valorNovo);

        for (Observador observador : observadores) {
            observador.update(valorNovo, this.valorAntigo);
        }

        this.valorAntigo = valorNovo;
    }
}
