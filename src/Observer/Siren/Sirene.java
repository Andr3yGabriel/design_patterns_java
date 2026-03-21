package Observer.Siren;

import java.util.ArrayList;
import java.util.List;

public class Sirene {
    private final List<Observador> observadores;

    public Sirene() {
        observadores = new ArrayList<>();
    }

    void adicionarObservador(Observador observador) {
        IO.println("Novo observador adicionado: " + observador.getNome());
        observadores.add(observador);
    }

    void tocar() {
        IO.println("A sirene está tocando!");
        for (Observador observador : observadores) {
            observador.update();
        }
    }
}
